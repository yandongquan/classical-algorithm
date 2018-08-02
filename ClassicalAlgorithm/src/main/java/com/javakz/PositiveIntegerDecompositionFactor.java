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
 * @Description: 正整数分解质因数
 * @Date: Create in 15:30 2018/8/2
 * @Modified By: 
 */
public class PositiveIntegerDecompositionFactor {

    private static void achieve(int num) {
        for (int i = 2; i <= num; i++) {
            while (num != i) {
                if (num % i == 0) {
                    System.out.print(i + "*");
                    num = num / i;
                } else {
                    break;
                }
            }
        }
        System.out.print(num);
    }

    public static void main(String[] args) {
        System.out.println("--------------------start-------------------------");
        achieve(90);
        System.out.println();
        System.out.println("--------------------end---------------------------");
    }

}
