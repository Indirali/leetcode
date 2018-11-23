package com.leetcode.thread;

/**
 * Create with IntelliJ IDEA
 * User: Indira
 * Date: 2018/11/22
 * Time: 12:54
 **/
public class Alternate {

    boolean flag = true;
    int i = 0;

    static class PrintOdd implements Runnable {

        Alternate alternate;

        public PrintOdd(Alternate alternate) {
            this.alternate = alternate;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (alternate) {
                    if (alternate.flag) {
                        System.out.println(" ----> " + alternate.i++);
                        alternate.flag = false;
                    }
                }
            }
        }
    }

    static class PrintEven implements Runnable {

        Alternate alternate;

        public PrintEven(Alternate alternate) {
            this.alternate = alternate;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (alternate) {
                    if (!alternate.flag) {
                        System.out.println(alternate.i++);
                        alternate.flag = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Alternate alternate = new Alternate();
        Thread thread1 = new Thread(new PrintOdd(alternate));
        Thread thread2 = new Thread(new PrintEven(alternate));
        thread1.start();
        thread2.start();
    }

}
