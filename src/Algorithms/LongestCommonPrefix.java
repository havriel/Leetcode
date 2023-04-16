package Algorithms;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = new String[]{"flower","flow","flat"};
        System.out.println(longestCommonPrefix(words));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int index=0;
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        while (index<s1.length()&&index<s2.length()){
            if (s1.charAt(index)==s2.charAt(index)){
                index++;
            }else{
                break;
            }
        }
        return s1.substring(0, index);
    }
}
