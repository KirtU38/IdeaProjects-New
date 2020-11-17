package com.company.WithBlocks;

public class RunnerAllWB implements Runnable {

    TestWithBlocks testWB;

    public RunnerAllWB(TestWithBlocks testWB) {
        this.testWB = testWB;
    }

    @Override
    public void run() {
        System.out.println("STARTED   " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            testWB.incrementAll();
        }
    }
}
