package basicGrammar

fun main(args: Array<String>) {
    //类型后面加?表示可为空
    var age: String? = "23"
    //抛出空指针异常
    val ages = age!!.toInt()
    //不做处理返回 null
    val ages1 = age?.toInt()
    //age为空返回-1
    val ages2 = age?.toInt() ?: -1

    println(age)
    println(ages)
    println(ages1)
    println(ages2)

    var x = parseInt("1")
    var y = parseInt("2")
    if (x != null && y != null) {
        println(x * y)
    }
}

//当一个引用可能为 null 值时, 对应的类型声明必须明确地标记为可为 null。
fun parseInt(str: String): Int? {
    return str?.toInt()
}
