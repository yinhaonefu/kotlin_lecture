package com.shengsiyuan.kotlin

//这里是逻辑上的包名，如果改成demo2编译后的字节码文件会生成在demo2中，编译也不会报错

import java.util.function.Consumer

fun main(args: Array<String>){

    println("Hello World")

    println("-------------")

    val list: List<String> = listOf("hwllo", "world", "hello world")

    list.forEach(Consumer<String> { println(it) } )

    println("-------------")

    for (it in list){
        println(it)
    }

    println("-------------")

    println(sum(1, 2))
    println(sum2(3, 4))

    myPrint(5, 6)
    myPrint2(7, 8)

}
//定义函数返回Int类型
fun sum(a: Int,b: Int): Int{
    return a + b
}
//方法体只有一行代码大括号可以省略，通过类型推断返回值是Int，返回类型可以省略
fun sum2(a:Int,b:Int) = a + b
//没有返回值的话返回类型为Unit，也可以省略
fun myPrint(a:Int,b:Int):Unit = println(a + b)
//kotlin的字符串模板输出7 + 8 = 15
fun myPrint2(a:Int,b:Int) = println("$a + $b = ${a + b}")

