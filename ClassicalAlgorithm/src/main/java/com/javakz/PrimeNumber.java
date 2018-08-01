package com.javakz;

/**
 * .--,       .--,
 * ( (  \.---./  ) )
 * '.__/o   o\__.'
 * {=  ^  =}
 * >  -  <
 * /       \
 * //       \\
 * //|   .   |\\
 * "'\       /'"_.-~^`'-.
 * \  _  /--'         `
 * ___)( )(___
 * (((__) (__)))    高山仰止,景行行止.虽不能至,心向往之。
 * ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 *
 * @Author: yandq
 * @Description: 素数：整数在一个大于1的自然数中，除了1和此整数自身外，没法被其他自然数整除的数。
 * @Date: Create in 9:36 2018/8/1
 * @Modified By:
 */
public class PrimeNumber {

    private static void achieve(int i, int j) {
        for (int x = i; x <= j; x++) {
            if (iszhishu3(x)) {
                System.out.print(x + " ");
            }
        }
    }

    /**
     * 实现原理：除了1和此整数自身外
     *
     * @param x
     * @return
     */
    private static boolean iszhishu1(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 实现原理：除了1和此整数自身外的一半
     *
     * @param x
     * @return
     */
    private static boolean iszhishu2(int x) {
        for (int i = 2; i < x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 实现原理：除以 sqrt
     *
     * @param x
     * @return
     */
    private static boolean iszhishu3(int x) {
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("--------------------start-------------------------");
        achieve(101, 200);
        System.out.println();
        System.out.println("--------------------end---------------------------");
    }
}
