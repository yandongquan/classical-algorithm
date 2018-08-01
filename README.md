# Java 经典算法

:mouse: 分享一些 Java 经典算法

目录
-----------------

- [斐波那契数列](#斐波那契数列)
- [素数](#素数)
- [水仙花数](#水仙花数)
- [正整数分解质因数](#正整数分解质因数)
- [最大公约数和最小公倍数](#最大公约数和最小公倍数)

## 斐波那契数列 ##

题目：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？

程序分析： 兔子的规律为数列 1,1,2,3,5,8,13,21....  这个数列从第三项开始，每一项都等于前两项之和。（斐波那契数列）

代码：[FibonacciSequence.java](https://github.com/yandongquan/classical-algorithm/blob/master/ClassicalAlgorithm/src/main/java/com/javakz/FibonacciSequence.java)

## 素数 ##

题目：判断101-200之间有多少个素数，并输出所有素数。

程序分析：
- 素数：整数在一个大于1的自然数中，除了1和此整数自身外，没法被其他自然数整除的数。
- 判断素数的方法：用一个数除了1和此整数自身外或除以 sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。

代码：[PrimeNumber.java](https://github.com/yandongquan/classical-algorithm/blob/master/ClassicalAlgorithm/src/main/java/com/javakz/PrimeNumber.java)

## 水仙花数 ##


## 正整数分解质因数 ##


## 最大公约数和最小公倍数 ##
