package com.company.Regular;

public class RunnerA implements Runnable {

    Test test;

    public RunnerA(Test test) {
        this.test = test;
    }

    @Override
    public void run() {
        System.out.println("STARTED   " + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            test.incrementA();
        }
    }
}
