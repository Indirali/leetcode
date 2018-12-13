package com.leetcode.pattern;

/**
 * 双判断单例
 * <p>
 * Create with IntelliJ IDEA
 * User: Indira
 * Date: 2018/11/22
 * Time: 12:58
 **/
public class Singleton {

    /**
     * 使用Singleton的好处还在于可以节省内存，因为它限制了实例的个数，有利于Java垃圾回收
     * 作为通信媒介使用，也就是数据共享
     */

    private static volatile Singleton singleton;

    public Singleton() {
    }

    private static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
