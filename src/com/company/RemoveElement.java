package com.company;

public class RemoveElement {
    /**
     * 解题思路：遇到重复的数据就把后一个数据调整到重复的位置
      * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums,int val){
        int length=nums.length-1;//用length参数来调整数组的长度，这里还需注意对重复的位置再次检测
        for (int i=0;i<=length;i++){
            if(nums[i]==val){
                for(int j=i;j<length;j++){
                    nums[j]=nums[j+1];
                }
                length=length-1;
                i=i-1;//这里就是用来来控制对重复的位置重复检测的标志
            }
        }
        return length+1;
    }
}
