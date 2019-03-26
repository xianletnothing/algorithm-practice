package com.company;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n = 0;
        for(int i=0;i<nums.length-1;i++) {
            if (nums[i] != nums[i+1])
            {
                n++;
                nums[n] = nums[i+1];
            }
        }
        return n+1;
    }
}
