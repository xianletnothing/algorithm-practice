package com.company;

public class Main {

    public static void main(String[] args) {
        //两数之和
       int[] nums={0,1,2,2,3,0,4,2};
//        int target=10;
//        SumTwoNumber sumTwoNumber=new SumTwoNumber();
//        int[] subscript=sumTwoNumber.twoSum(nums,target);
        //数字反转
//        int x=-1230;
//        Revert revert=new Revert();
//        int result =revert.revert(x);
//        System.out.println(result);
        //回文数判断
//
//        String[] x = {"addsa", "addhfgf", "addgfgh"};
//        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
//        String s=longestCommonPrefix.longestCommonPrefix(x);
//        System.out.println(s);
         //有效括号判断
//        String  str="[";
//        IsVaild isVaild=new IsVaild();
//        boolean bool=isVaild.isVaild(str);
//        System.out.println(bool);
         RemoveElement removeElement=new RemoveElement();
         int length=removeElement.removeElement(nums,2);
         System.out.println(length);
    }
}
