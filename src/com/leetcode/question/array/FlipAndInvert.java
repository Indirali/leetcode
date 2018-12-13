package com.leetcode.question.array;

/**
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 * <p>
 * Create with IntelliJ IDEA
 * User: Indira
 * Date: 2018/12/13
 * Time: 11:14
 **/
public class FlipAndInvert {

    public int[][] flipAndInvertImage(int[][] array) {
        for (int[] arrayX : array) {
            int min = 0;
            int max = arrayX.length - 1;
            while (min <= max) {
                int temp = arrayX[min];
                arrayX[min] = arrayX[max] == 0 ? 1 : 0;
                arrayX[max] = temp == 0 ? 1 : 0;
                min++;
                max--;
            }
        }
        return array;
    }

}
