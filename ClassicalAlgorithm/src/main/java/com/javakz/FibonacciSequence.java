package com.javakz;

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
 * @Description: 斐波那契数列指的是这样一个数列：1、1、2、3、5、8、13、21....  这个数列从第三项开始，每一项都等于前两项之和。
 * @Date: Create in 9:18 2018/8/1
 * @Modified By: 
 */
public class FibonacciSequence {

    private static void achieve(int y) {
        for (int i=1;i<=y;i++) {
            System.out.print(f(i)+" ");
        }
    }

    private static int f(int x) {
        if (x==1 || x==2) {
            return 1;
        } else {
            return f(x-1)+f(x-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("--------------------start-------------------------");
        achieve(20);
        System.out.println();
        System.out.println("--------------------end---------------------------");
    }

}
