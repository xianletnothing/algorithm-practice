package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums={2,5,5,11};
        int target=10;
        SumTwoNumber sumTwoNumber=new SumTwoNumber();
        int[] subscript=sumTwoNumber.twoSum(nums,target);
    }
}
