package basicGrammar//可变变量定义：var 关键字
//var <标识符> : <类型> = <初始化值>

//不可变变量定义：val 关键字，只能赋值一次的变量(类似Java中final修饰的变量)
//val <标识符> : <类型> = <初始化值>

fun main(args: Array<String>) {
    val a: Int = 1
    val b = 1
    val c: Int
    c = 1

    var x = 5
    x++
    print(a);
    print(b);
    print(c);
    print(x);
}