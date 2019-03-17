package com.company;

public class Revert {
    public int revert(int x) {
        int result = 0;
        while (true) {
            int n = x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && n > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 &&n<-8)) return 0;
            result = result * 10 + n;

            if (x == 0) {
                break;
            }
        }
        return result;
    }
}
