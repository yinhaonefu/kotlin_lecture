package com.shengsiyuan.kotlin.lesson5

fun main(args: Array<String>) {
    println(myPrint("hello"))
    println(myPrint("world"))
    println(myPrint("hello world"))
    println(myPrint("test"))

    println("-------")

    println(myPrint2("hello"))
    println(myPrint2("world"))
    println(myPrint2("hello world"))
    println(myPrint2("test"))

    println("-------")

    println(myPrint3("hello"))
    println(myPrint3("world"))
    println(myPrint3("hello world"))
    println(myPrint3("test"))

    println("-------")

    myPrint4(6)
}

fun myPrint(str: String): String {
    when (str) {
        "hello" -> return "HELLO"
        "world" -> return "WORLD"
        "hello world" -> return "HELLO WORLD"
        else -> return "other input"
    }
}
//也可以将return提到前面更简洁
fun myPrint2(str: String): String {
    return when (str) {
        "hello" -> "HELLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "other input"
    }
}
//也可以函数式赋值
fun myPrint3(str: String): String =
    when (str) {
        "hello" -> "HELLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "other input"
    }


fun myPrint4(i: Int) {
    var result = when(i) {
        1 -> {
            println("i = 1")
            10
        }
        2 -> {
            println("i = 2")
            20
        }
        3,4,5 -> {
            println("i = 3 or 4 or 5")
            30
        }
        //运算符重写，C++中有这个语法，Java中没有，在Kotlin重新引入 指区间范围，包括10 左闭右闭
        in 6..10 -> {
            println("i is between 6 and 10")
            40
        }
        else -> {
            println("a is other value")
            50
        }
    }
    println(result)
}