public class Solution {
    public static void main(String[] args) {
        int index;
        String inString = "gdsjhjhaksfzkjlhvgenklanlnbdvjsn kjbdfjhsafnajksfajhfkjashxfkjbahfksbnvhjnabvhksn,vjxzhvmn,dskjhbzxn,mnvjbdkshnzxm,vbjdhzn,mxvjsd,bvz,jxbjkdsnzxbvnsilghsidhgoiewhjsdnvbknsvkbahv"; //put here your string
        char[] inChar = inString.toCharArray();
        String countStr = "";
        int[] countAr = new int[100];
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