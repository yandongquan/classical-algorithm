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
 * @Description: 一个正整数，如果恰好等于除它本身外的所有因子之和
 * @Date: Create in 18:16 2018/8/13
 * @Modified By: 
 */
public class Complete {

    public static void main(String[] args) {
        int i,j;
        for(i=1;i<1000;i++) {
            int sum=0;
            for(j=1;j<i;j++) {
                if(i%j==0) {
                    sum+=j;
                }
            }
            if(sum==i) {
                System.out.println(i);
            }
        }
    }
}
