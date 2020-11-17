package com.company;

import com.company.Regular.*;
import com.company.Static.*;
import com.company.WithBlocks.*;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Потоки на один обьект класса со всеми synchronized методами
        /*Test test = new Test();

        new Thread(new RunnerAll(test), "All").start();
        new Thread(new RunnerA(test), "A-Runner").start();
        new Thread(new RunnerB(test), "B-Runner").start();
        new Thread(new RunnerC(test), "C-Runner").start();
        new Thread(new RunnerD(test), "D-Runner").start();
        new Thread(new RunnerE(test), "E-Runner").start();

        scanner.nextLine();
        System.out.printf(" a-%d%n b-%d%n c-%d%n d-%d%n e-%d%n", test.a, test.b, test.c, test.d, test.e);*/

// В классе RunnerA начинает выполняться метод run() -> Захватывается лок у всего обьекты ->
// Выполняется весь метод(10 инкрементов) -> Лок освобождается -> Передается другому потоку
// Здесь мы проверяем как захватывается лок у классов и методов, в случае выше мы имеем 6 synchronized метода в Классе Test,
// и все методы в классе Test выполняются по-очереди, ведь даже если методов много, то все равно только один поток
// может войти в обьект одновременно, потому что synchronized метод выполняет лок всего обьекта.
// В итоге мы видим что метод IncrementAll выполняется только монолитно, с начала и до конца не отдавая ключ никому другому

        // Потоки на разные обькеты одного класса
        /*Test test1 = new Test();
        Test test2 = new Test();
        Test test3 = new Test();
        Test test4 = new Test();
        Test test5 = new Test();
        Test test6 = new Test();

        new Thread(new RunnerAll(test1), "All").start();
        new Thread(new RunnerA(test2), "A-Runner").start();
        new Thread(new RunnerB(test3), "B-Runner").start();
        new Thread(new RunnerC(test4), "C-Runner").start();
        new Thread(new RunnerD(test5), "D-Runner").start();
        new Thread(new RunnerE(test6), "E-Runner").start();*/


// А в этом примере мы такого не наблюдаем, потоки выполняются параллельно, тк получают доступ к разным обьектам,
// но тем не менее это соверщенно другой случай


        // Потоки на один обьект, но с synchronized блоками, а не методами
        /*TestWithBlocks testWB = new TestWithBlocks();

        new Thread(new RunnerAllWB(testWB), "All").start();
        new Thread(new RunnerAWB(testWB), "A-Runner").start();
        new Thread(new RunnerBWB(testWB), "B-Runner").start();
        new Thread(new RunnerCWB(testWB), "C-Runner").start();
        new Thread(new RunnerDWB(testWB), "D-Runner").start();
        new Thread(new RunnerEWB(testWB), "E-Runner").start();

        scanner.nextLine();
        System.out.printf(" a-%d%n b-%d%n c-%d%n d-%d%n e-%d%n", testWB.a, testWB.b, testWB.c, testWB.d, testWB.e);*/

// Здесь мы лочим только переменные a,b,c,d,e по отедльности, когда они используются методами, и поэтому потоки выполняются
// по настоящему одновременно даже на один обьект

        // Потоки на static методы(можно сказать на static класс)
        new Thread(new RunnerAllST(), "All").start();
        new Thread(new RunnerAST(), "A-Runner").start();
        new Thread(new RunnerBST(), "B-Runner").start();
        new Thread(new RunnerCST(), "C-Runner").start();
        new Thread(new RunnerDST(), "D-Runner").start();
        new Thread(new RunnerEST(), "E-Runner").start();

        scanner.nextLine();
        System.out.printf(" a-%d%n b-%d%n c-%d%n d-%d%n e-%d%n", TestStatic.a, TestStatic.b, TestStatic.c, TestStatic.d, TestStatic.e);

// Здесь ситуация похожая с первой
    }
}




