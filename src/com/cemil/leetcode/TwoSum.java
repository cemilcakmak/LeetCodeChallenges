package com.cemil.leetcode;

// O(n^2) solution
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == 9) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
