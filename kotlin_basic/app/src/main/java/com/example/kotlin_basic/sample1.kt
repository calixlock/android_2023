package com.example.kotlin_basic
fun main() {
//     hellow();
    val x = add(1,2); // const
    println(x);

//     var y = Int;
    var y = 1; // variable
    println(y);
    y = add(4,5);

    println("x is \$${x}, y is ${y}");
    println("x=y is true? ${x==y}");

    println(" 4,5 max? ${maxBy(4,5)}");
    checkNum(11)
    array()

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
