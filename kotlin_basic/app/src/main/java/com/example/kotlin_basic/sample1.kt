package com.example.kotlin_basic

import androidx.compose.ui.text.toUpperCase

fun main() {
//    hellow();
//    val x = add(1,2); // const
//    println(x);
//
//    var y = Int;
//    var y = 1; // variable
//    println(y);
//    y = add(4,5);
//
//    println("x is \$${x}, y is ${y}");
//    println("x=y is true? ${x==y}");
//
//    println(" 4,5 max? ${maxBy(4,5)}");
//    checkNum(11)
//    array()
//    forAndWhile()
    nullCheck()

}

fun nullCheck() {
    var n = "park"
//    var n1 = null
    var nullName : String? = null // type에 ? 추가로 null 사용가능
    var nameInUpperCase : String = n.toUpperCase()
    var nullNameUpperCase : String? = nullName?.toUpperCase() // null 이면 null반환 / 아니면 실행
//    println("nullName = ${nullName} , nullNameUpperCase = ${nullNameUpperCase} ")

    // ?: xxx  > null일 경우 xxx 수행
    val lastName = null
    val fulltName = n +" "+ (lastName?: "None lastName")
//    println(fulltName)

    // !! 무시
    fun ignoreNull(str:String?){
        val notNull : String = str!! // str은 절대 null 값을 가지지 않는다고 선언
        val strUpper = str.toUpperCase()
//        println(strUpper)
        val email : String?= null
//            "xxx@naver.com"
        email?.let{
            println("email is ${email}")
        }
    }
//    ignoreNull(null)
    ignoreNull("hong")



}

fun forAndWhile(){
    val stu = arrayListOf("tom","kim","son","na")
//    for (n in stu){
//        println("${n}")
//    }
//    for(i in 1..10) {
//        println(i)
//    }
//    for(i in 10 downTo 1){
//        println(i)
//    }
//    for(i in 1 until 3){
//        println(i)
//    }
    var idx = 0
//    while (idx <5){
//        println("${idx + 1}번째 학생 : ${stu.get(idx)}")
//        idx++
//    }
    for ((idx,name) in stu.withIndex()){
        println("${idx + 1}번째 학생 : ${name}")
    }
}

fun hellow() {
    println("hellow!!!");
}

fun add(a : Int ,b :Int) : Int{
    return a+b
}
fun maxBy(a:Int,b:Int) = if(a>b) a else b;

fun checkNum(num:Int){
    when(num){
        1-> println(num)
        2,3-> println("number 2 or 3")
        else -> println("i dont Know")

    }
    var z = when(num){
        1->1
        2->2
        in 3..10 -> println("3~10 사이의 숫자")
        in 11..100 -> println("11~100 사이의 숫자")
        else -> println("1~100 사이의 숫자가 아님")
//         else를 꼭 써줘야한다
    }

    // expression > return값 존재
    // statement > command 명령 지시
}
// List > 1. List(immutable)
// 		  2. MutableList
fun array(){
    val arr = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val arr2 = arrayOf(1,"dd",3f)
    val list2 = listOf(1,"cc",11L)

    arr[0] = 3
    println(arr)
    var result = list.get(0)
    val arrList= arrayListOf<Int>()
    arrList.add(10)
    arrList.add(20)
    arrList[0] = 20
}

