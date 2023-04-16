package Algorithms;

public class Palindrome {
    public static void main(String[] args) {
        int x = 1214;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int length = s.length();
        for (int i=0;i<length/2;i++){
            if (s.charAt(i)!=s.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
}
