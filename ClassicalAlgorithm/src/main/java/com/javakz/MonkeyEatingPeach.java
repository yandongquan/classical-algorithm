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
 * @Description: 猴子偷桃
 * @Date: Create in 18:00 2018/8/15
 * @Modified By: 
 */
public class MonkeyEatingPeach {
    private static int total(int day){
        if(day == 10){
            return 1;
        }
        else{
            return (total(day+1)+1)*2;
        }
    }

    public static void main(String[] args) {
        System.out.println("猴子偷桃");
        System.out.println("第一天共摘了"+total(1));
    }
}
