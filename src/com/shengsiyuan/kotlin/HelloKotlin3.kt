package com.shengsiyuan.kotlin

fun main(args: Array<String>) {
    var x = 20
    var y = 30

    var max:Int
    var min:Int

//    if(x > y){
//        max = x
//        min = y
//    }else{
//        max = y
//        min = x
//    }
//
//    println("max = $max, min = $min")

    println("-------")

    /**
     * if后代码块只有一行代码
     */
    max = if (x > y) x else y
    min = if (x > y) y else x

    println("max = $max, min = $min")

    println("-------")

    /**
     * 如果if后代码块不止一行，会返回最后一行代码返回的内容
     */
    max = if (x > y) {
        println("x > y")
        x
    } else {
        println(" x < y")
        y
    }

    min = if (x > y) {
        println("x > y")
        y
    } else {
        println(" x < y")
        x
    }

    println("max = $max, min = $min")

}