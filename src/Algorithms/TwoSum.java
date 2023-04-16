package Algorithms;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[] {2,5,7,6,4,8};
        System.out.println(Arrays.toString(twoSum(nums,15)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0;i< nums.length;i++){
            for(int j =i+1;j< nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
