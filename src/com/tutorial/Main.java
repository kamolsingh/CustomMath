package com.tutorial;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        int solcnt = 0;
        long starttime = System.currentTimeMillis();
        for (int i = 2; i < 100000; i++) {
            if (CustomMathUtil.isPerfectSquare(i)){
                //System.out.println(i + " has a root = " + (int)Math.sqrt(i));
                solcnt++;
            }
        }
        long completedIn = System.currentTimeMillis();
        System.out.println("#2 Running Time: " + Duration.ofMillis(completedIn - starttime).toMillis() + " ms. Yield " + solcnt + " results");
    }


}
