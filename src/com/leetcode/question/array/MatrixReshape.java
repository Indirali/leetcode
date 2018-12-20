package com.leetcode.question.array;

/**
 * Create with IntelliJ IDEA
 * User: Indira
 * Date: 2018/12/14
 * Time: 11:40
 **/
public class MatrixReshape {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int x = nums.length;
        int y = nums[0].length;
        if (x * y != r * c) {
            return nums;
        }
        int tr = 0;
        int tc = 0;
        int[][] newNums = new int[r][c];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                newNums[tr][tc] = nums[i][j];
                tc++;
                if (tc == c) {
                    tc = 0;
                    tr++;
                    if (tr == r) {
                        tr = 0;
                    }
                }
            }

        }
        return newNums;

    }

}
