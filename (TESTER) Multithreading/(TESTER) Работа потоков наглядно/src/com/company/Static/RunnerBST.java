package com.company.Static;

import com.company.Runner;

public class RunnerBST extends Runner implements Runnable {

    long start;

    public RunnerBST(long start) {
        this.start = start;
    }

    @Override
    public void run() {
        System.out.println("STARTED   " + Thread.currentThread().getName());
        for (int i = 0; i < numOfIncrement; i++) {
            TestStatic.incrementB();
        }
        System.out.println(System.currentTimeMillis() - start + " ms КОНЕЦ");
    }
}
