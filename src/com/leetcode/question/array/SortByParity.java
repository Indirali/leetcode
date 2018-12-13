package com.leetcode.question.array;

/**
 * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 * 你可以返回满足此条件的任何数组作为答案。
 * <p>
 * Create with IntelliJ IDEA
 * User: Indira
 * Date: 2018/12/13
 * Time: 10:56
 **/
public class SortByParity {

    public int[] sortArrayByParity(int[] array) {

        // 返回数组
        int[] sort = new int[array.length];

        int min = 0;
        int max = array.length - 1;

        for (int anArray : array) {
            if (anArray % 2 == 0) {
                sort[min++] = anArray;
            } else {
                sort[max--] = anArray;
            }
        }
        return sort;
    }

}
