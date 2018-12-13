package com.leetcode.question.array;

import java.util.Arrays;

/**
 * 给定长度为 2n 的数组, 你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从1 到 n 的 min(ai, bi) 总和最大。
 * Create with IntelliJ IDEA
 * User: Indira
 * Date: 2018/12/13
 * Time: 12:20
 **/
public class ArrayPairSum {

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int x = 0; x < nums.length - 1; x = x + 2) {
            sum += nums[x];
        }
        return sum;
    }

}
