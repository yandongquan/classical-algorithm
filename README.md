# Java 经典算法

:mouse: 分享一些 Java 经典算法

目录
-----------------

- [斐波那契数列](#斐波那契数列)
- [素数](#素数)
- [水仙花数](#水仙花数)
- [正整数分解质因数](#正整数分解质因数)
- [最大公约数和最小公倍数](#最大公约数和最小公倍数)
- [s=a+aa+aaa+aaaa+aa...a](#s=a+aa+aaa+aaaa+aa...a)
- [完数](#完数)
- [9*9口诀](#9*9口诀)
- [猴子吃桃问题](#猴子吃桃问题)

## 斐波那契数列 ##

题目：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？

程序分析：兔子的规律为数列 1,1,2,3,5,8,13,21....  这个数列从第三项开始，每一项都等于前两项之和。（斐波那契数列）

代码：[FibonacciSequence.java](https://github.com/yandongquan/classical-algorithm/blob/master/ClassicalAlgorithm/src/main/java/com/javakz/FibonacciSequence.java)

## 素数 ##

题目：判断101-200之间有多少个素数，并输出所有素数。

程序分析：
- 素数：整数在一个大于1的自然数中，除了1和此整数自身外，没法被其他自然数整除的数。
- 判断素数的方法：用一个数除了1和此整数自身外或除以 sqrt(这个数)，如果能被整除，则表明此数不是素数，反之是素数。

代码：[PrimeNumber.java](https://github.com/yandongquan/classical-algorithm/blob/master/ClassicalAlgorithm/src/main/java/com/javakz/PrimeNumber.java)

## 水仙花数 ##

题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。

程序分析：水仙花数是指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身（例如：1^3 + 5^3+ 3^3 = 153）。

代码：[NarcissisticNumber.java](https://github.com/yandongquan/classical-algorithm/blob/master/ClassicalAlgorithm/src/main/java/com/javakz/NarcissisticNumber.java)

## 正整数分解质因数 ##

题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。

程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
- (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
- (2)如果n <> k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你,重复执行第一步。
- (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。

代码：[PositiveIntegerDecompositionFactor.java](https://github.com/yandongquan/classical-algorithm/blob/master/ClassicalAlgorithm/src/main/java/com/javakz/NarcissisticNumber.java)

## 最大公约数和最小公倍数 ##

题目：输入两个正整数m和n，求其最大公约数和最小公倍数。

代码：[MaxCommonDivisorAndMinCommonMultiple.java](https://github.com/yandongquan/classical-algorithm/blob/master/ClassicalAlgorithm/src/main/java/com/javakz/MaxCommonDivisorAndMinCommonMultiple.java)


## 完数 ##

题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程 找出1000以内的所有完数。

代码：[Complete.java](https://github.com/yandongquan/classical-algorithm/blob/master/ClassicalAlgorithm/src/main/java/com/javakz/Complete.java)


## 9*9口诀 ##

题目：输出9*9口诀。

程序分析：分行与列考虑，共9行9列，i控制行，j控制列。

代码：[NineTimesNine.java](https://github.com/yandongquan/classical-algorithm/blob/master/ClassicalAlgorithm/src/main/java/com/javakz/NineTimesNine.java)

## 猴子吃桃问题 ##

题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩下的桃子吃掉一半，
又多吃了一个。以后每天早上都吃了前一天剩下 的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。

程序分析：采取逆向思维的方法，从后往前推断。

代码：[MonkeyEatingPeach.java](https://github.com/yandongquan/classical-algorithm/blob/master/ClassicalAlgorithm/src/main/java/com/javakz/MonkeyEatingPeach.java)
