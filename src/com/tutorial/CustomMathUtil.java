package com.tutorial;

public  class CustomMathUtil {

    public static boolean isPerfectSquare(Integer input){
        return Math.ceil(Math.sqrt(input)) == Math.floor(Math.sqrt(input));
    }

    // NOT a good idea. It also provides 43 invalid outputs when test with 1,000,000.
    // For example 524304 = 724.0883924 ^ 2
    public static boolean isPerfectSquareNotGood(Integer input){
        for (int i = 1; i <= input/2; i++) {
            if (i * i == input){
                return true;
            }
        }
        return false;
    }
}
