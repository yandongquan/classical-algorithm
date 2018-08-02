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
 * @Description: 水仙花数：指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）。
 * @Date: Create in 15:06 2018/8/2
 * @Modified By: 
 */
public class NarcissisticNumber {

    private static void achieve(int i, int j) {
        for (;i<=j;i++) {
            int x=0,y=0,z=0;
            x = i/100;
            y = (i%100)/10;
            z = i%10;
            if (i==x*x*x+y*y*y+z*z*z) {
                System.out.print(i+" ");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("--------------------start-------------------------");
        achieve(100, 999);
        System.out.println();
        System.out.println("--------------------end---------------------------");
    }

}
