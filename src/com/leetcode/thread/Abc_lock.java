package com.leetcode.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Create with IntelliJ IDEA
 * User: Indira
 * Date: 2018/11/22
 * Time: 16:56
 **/
public class Abc_lock {

    private static Lock lock = new ReentrantLock();// 通过JDK5中的Lock锁来保证线程的访问的互斥
    private static int state = 0;//通过state的值来确定是否打印

    static class ThreadA extends Thread {
        @Override
        public void run() {
            try {
                lock.lock();
                while (state % 3 == 0) {// 多线程并发，不能用if，必须用循环测试等待条件，避免虚假唤醒
                    System.out.print("A \n");
                    state++;

                }
            } finally {
                lock.unlock();// unlock()操作必须放在finally块中
            }
        }
    }

    static class ThreadB extends Thread {
        @Override
        public void run() {
            try {
                lock.lock();
                while (state % 3 == 1) {// 多线程并发，不能用if，必须用循环测试等待条件，避免虚假唤醒
                    System.out.print("B \n");
                    state++;
                }
            } finally {
                lock.unlock();// unlock()操作必须放在finally块中
            }

        }
    }

    static class ThreadC extends Thread {
        @Override
        public void run() {
            try {
                lock.lock();
                while (state % 3 == 2) {// 多线程并发，不能用if，必须用循环测试等待条件，避免虚假唤醒
                    System.out.print("C \n");
                    state++;
                }
            } finally {
                lock.unlock();// unlock()操作必须放在finally块中
            }
        }
    }

    public static void main(String[] args) {
        new ThreadA().start();
        new ThreadB().start();
        new ThreadC().start();
    }

}
