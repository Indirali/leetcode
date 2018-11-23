package com.leetcode.pattern;

/**
 * Create with IntelliJ IDEA
 * User: Indira
 * Date: 2018/11/22
 * Time: 12:58
 **/
public class Singleton {

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
