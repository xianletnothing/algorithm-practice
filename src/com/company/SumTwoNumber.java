package com.company;

import java.util.HashMap;
import java.util.Map;

public class SumTwoNumber {
    public int[] twoSum(int[] nums, int targert) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int com = targert - nums[j];
            if (map.containsKey(com) && map.get(com) != j) {
                return new int[]{j, map.get(com)};
            }
        }
        throw  new  IllegalArgumentException("没有匹配的两个数");
    }
}
