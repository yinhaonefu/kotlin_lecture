package com.shengsiyuan.kotlin.demo

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

}