package basicGrammar//$ 表示一个变量名或者变量值
//$varName 表示变量值
//${varName.fun()} 表示变量的方法返回值:

fun main(args: Array<String>) {
    var a = 1
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)
}
