public class FixedSolution{
    public static void main(String[] args) {
        int index;
        String inString = "AAAAAgdsjhjhaksfzkjlhvgenklanlnbdvjsn kjbdfjhsafnajksfajhfkjashxfkjbahfksbnvhjnabvhksn,vjxzhvmn,dskjhbzxn,mnvjbdkshnzxm,vbjdhzn,mxvjsd,bvz,jxbjkdsnzxbvnsilghsidhgoiewhjsdnvbknsvkbahv"; //put here your string
        char[] inChar = inString.toCharArray();
        String countStr = "";
        int[] countAr = new int[inChar.length];
        for (int i = 0; i < inChar.length; i++) {
            index = countStr.indexOf(inChar[i]);
            if (index >=0){
                countAr[index]++;
            }
            else {
                countStr = countStr + inChar[i];
                countAr[countStr.length()-1]++;
            }
        }
        for (int i = 0; i < countStr.length(); i++){
            System.out.println(countStr.charAt(i) + " " +countAr[i]);
        }
        System.out.println(inString.length());
    }
}
