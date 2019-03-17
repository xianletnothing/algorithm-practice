package com.company;

public class HuiWenShu {
    public boolean huiWenShu(int x) {
        int result = 0;

        int nums = x;
        if (nums < 0) {
            return false;
        }
        while (true) {
            int n = x % 10;
            x = x / 10;
            result = result * 10 + n;
            if (x == 0) {
                break;
            }
        }
        if (nums == result) {
            System.out.println(nums + "是回文数");
            return true;
        } else {
            System.out.println(nums + "不是回文数");
            return false;
        }
    }
}

