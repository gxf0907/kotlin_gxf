package basicGrammar

fun main(args: Array<String>) {
    println(sum1(1, 2));
    println(sum2(1, 2));
    println(sum3(1, 2));
    printSum1(1, 2);
    printSum2(1, 2);
    vars(1, 2, 3, 4);

    //lambda(匿名函数)
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    println(sumLambda(1, 2))
}

//函数定义使用关键字 fun，参数格式为：参数 : 类型
fun sum1(a: Int, b: Int): Int {
    return a + b
}

//表达式作为函数体，返回类型自动推断：
fun sum2(a: Int, b: Int) = a + b;

// public 方法则必须明确写出返回类型
public fun sum3(a: Int, b: Int): Int = a + b

//无返回值的函数(类似Java中的void)：
fun printSum1(a: Int, b: Int): Unit {
    println(a + b)
}

// 如果是返回 Unit类型，则可以省略(对于public方法也是这样)：
public fun printSum2(a: Int, b: Int) {
    println(a + b)
}

//可变长参数函数
//函数的变长参数可以用 vararg 关键字进行标识：
fun vars(vararg v: Int) {
    for (vt in v) {
        print(vt)
    }
    println()
}


