package com.company;

public class RemoveElement {
    public int removeElement(int[] nums,int val){
        int length=nums.length-1;
        for (int i=0;i<=length;i++){
            if(nums[i]==val){
                for(int j=i;j<length;j++){
                    nums[j]=nums[j+1];
                }
                length=length-1;
                i=i-1;
            }
        }
        return length+1;
    }
}
