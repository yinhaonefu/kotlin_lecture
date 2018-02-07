package com.shengsiyuan.kotlin

//import com.shengsiyuan.kotlin2.multiply
import com.shengsiyuan.kotlin2.multiply as myMultiply


fun main(args: Array<String>){
    val a:Int = 1 //定义常量，不能重新赋值
    val b = 2 //定义常量，通过类型推断 Int可以省略

    var c:Int
    c = 3

    var d = 4
    d = 5

    /**
     *
     */

    /*
    /*
    注释可以嵌套
     */
     */

    var x = 10
    var y:Byte = 20

    //x = y //赋值失败类型不匹配

    x = y.toInt()//赋值成功


    println(myMultiply(5,10))//导入了另一个包中的multiply函数并指定了myMultiply别名


    //数据定义为常量，不允许重新指向但是可以更改数据元素值
    val array = intArrayOf(1,2,3)
    array.set(0,4)//修改第一位元素值 array[0] = 4



}