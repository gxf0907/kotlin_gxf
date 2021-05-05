package basicGrammar

fun main(args: Array<String>) {
    println(getStringLength("Hello World!"));
}

fun getStringLength(obj: Any): Int? {
    if (obj is String && obj.length > 0) {
        // 做过类型判断以后，obj会被系统自动转换为String类型
        return obj.length
    }

    //在这里还有一种方法，与Java中instanceof不同，使用!is
    //这里的obj仍然是Any类型的引用
    if (obj !is String) {
        return obj.toString().length
    }
    return null
}