package com.shengsiyuan.kotlin.lesson5

fun main(args: Array<String>) {
    println(convert2Uppercase("hello"))
    println(convert2Uppercase(123))
}

//Any是Kotlin类层次体系中的根类，所有类都会继承它，地位相当于Java中的Object
fun convert2Uppercase(str: Any): String? {
    if (str is String) {
        return str.toUpperCase()//在Java中需要强制转换成String，Kotlin中if判断已经成立，编译器认为是String类型
    }
    return null
}