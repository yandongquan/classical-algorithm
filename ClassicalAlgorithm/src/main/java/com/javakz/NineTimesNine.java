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
 * @Description: 9*9
 * @Date: Create in 9:25 2018/8/14
 * @Modified By: 
 */
public class NineTimesNine {

    public static void main(String[] args) {

        System.out.println("-----------------------------9*9口诀-----------------------------");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                if (i*j>=10) {
                    System.out.print(j+"*"+i+"="+i*j+" ");
                } else {
                    System.out.print(j+"*"+i+"= "+i*j+" ");
                }
            }
            System.out.println();
        }
    }

}
