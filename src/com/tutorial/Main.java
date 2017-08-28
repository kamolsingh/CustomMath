package com.tutorial;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        int sol1cnt = 0, sol2cnt = 0;
        long starttime = System.currentTimeMillis();
//        for (int i = 2; i < 1000000; i++) {
//            if (CustomMathUtil.isPerfectSquareNotGood(i)){
//                //System.out.println("Sol1 " + i + " has a squar root = " + (int)Math.sqrt(i));
//                sol1cnt++;
//            }
//        }
        long completedIn = System.currentTimeMillis();
        System.out.println("#1 Running Time: " + Duration.ofMillis(completedIn - starttime).toMillis() + " ms. Yield " + sol1cnt + " results");

        starttime = System.currentTimeMillis();
        for (int i = 2; i < 100000; i++) {
            if (CustomMathUtil.isPerfectSquare(i)){
                //System.out.println("Sol2 " + i + " has a squar root = " + (int)Math.sqrt(i));
                sol2cnt++;
            }
        }
        completedIn = System.currentTimeMillis();
        System.out.println("#2 Running Time: " + Duration.ofMillis(completedIn - starttime).toMillis() + " ms. Yield " + sol2cnt + " results");
    }


}
