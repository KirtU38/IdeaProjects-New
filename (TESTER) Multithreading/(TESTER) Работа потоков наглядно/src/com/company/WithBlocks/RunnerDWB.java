package com.company.WithBlocks;

import com.company.Runner;

public class RunnerDWB extends Runner implements Runnable {

    TestWithBlocks testWB;
    long start;

    public RunnerDWB(TestWithBlocks testWB, long start) {
        this.testWB = testWB;
        this.start = start;
    }

    @Override
    public void run() {
        System.out.println("STARTED   " + Thread.currentThread().getName());
        for (int i = 0; i < numOfIncrement; i++) {
            testWB.incrementD();
        }
        System.out.println(System.currentTimeMillis() - start + " ms КОНЕЦ");
    }
}
