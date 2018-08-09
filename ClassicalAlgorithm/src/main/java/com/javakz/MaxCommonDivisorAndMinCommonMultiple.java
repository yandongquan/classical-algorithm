package com.javakz;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 *  .--,       .--,
 * ( (  \.---./  ) )
 *  '.__/o   o\__.'
 *     {=  ^  =}
 *      >  -  <
 *     /       \
 *    //       \\
 *   //|   .   |\\
 *   "'\       /'"_.-~^`'-.
 *      \  _  /--'         `
 *    ___)( )(___
 *   (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 * @Author: yandq
 * @Description: 最大公约数和最小公倍数
 * @Date: Create in 18:05 2018/8/9
 * @Modified By: 
 */
public class MaxCommonDivisorAndMinCommonMultiple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = scanner.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = scanner.nextInt();

        System.out.println("你输入的数："+num1+"和"+num2);

        System.out.println("递归法:最大公约数：" + maxCommonDivisor(num1, num2)+" 递归法:最小公倍数：" + minCommonMultiple(num1, num2));
        System.out.println("辗转相除法:最大公约数：" + maxCommonDivisor2(num1, num2)+" 递归法:最小公倍数：" + minCommonMultiple(num1, num2));
        System.out.println("穷举法:最大公约数：" + maxCommonDivisor3(num1, num2)+" 穷举法：最小公倍数：" + minCommonMultiple2(num1, num2));
    }

    /**
     * 递归求最小公倍数
     * @param m
     * @param n
     * @return
     */
    private static int minCommonMultiple(int m, int n) {
        return m * n / maxCommonDivisor(m, n);
    }
    /**
     * 穷举法求最小公倍数
     * @param m
     * @param n
     * @return
     */
    private static int minCommonMultiple2(int m, int n) {
        for (int z=m;;z++) {
            if(z%m==0&&z%n==0){
                return z;
            }
        }
    }

    /**
     * 递归法求最大公约数
     * @param m
     * @param n
     * @return
     */
    private static int maxCommonDivisor(int m, int n) {
        // 保证m>n,若m<n,则进行数据交换
        if (m<n) {
            int temp = m;
            m = n;
            n = temp;
        }
        if (m%n==0) {
            return n;
        } else {
            return maxCommonDivisor(n,m%n);
        }
    }

    /**
     * 辗转相除法求最大公约数
     * @param m
     * @param n
     * @return
     */
    private static int maxCommonDivisor2(int m, int n) {
        // 保证m>n,若m<n,则进行数据交换
        if (m<n) {
            int temp = m;
            m = n;
            n = temp;
        }
        // 在余数不能为0时,进行循环
        while (m%n!=0) {
            int temp = m%n;
            m = n;
            n = temp;
        }
        // 返回最大公约数
        return n;
    }

    /**
     * 穷举法求最大公约数
     * @param m
     * @param n
     * @return
     */
    public static int maxCommonDivisor3(int m,int n){
        for(int z=m;z>=0;z--){
            if(m%z==0&&n%z==0){
                return z;
            }
        }
        return 1;
    }
}
