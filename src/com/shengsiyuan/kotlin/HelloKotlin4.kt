package com.shengsiyuan.kotlin

fun main(args: Array<String>) {
    println(convert2Int("23"))
    println(convert2Int("hello"))

    printMultiply("4", "5")
    printMultiply("a", "b")

}

/**
 * 返回值为Int?，多个问号表示可能为null
 */
fun convert2Int(str: String): Int?{
    try {
        return str.toInt()
    }catch (ex: NumberFormatException){
        return null
    }
}


fun printMultiply(a: String, b: String) {

    val a2Int = convert2Int(a)
    var b2Int = convert2Int(b)

    //编译报错，因为convert2Int可能返回null
//    println(a2Int * b2Int)

    //经过判断后编译器才认为通过，避免运行时的问题
    if (a2Int != null && b2Int != null) {
        println(a2Int * b2Int)
    } else {
        println("param not int")
    }

}