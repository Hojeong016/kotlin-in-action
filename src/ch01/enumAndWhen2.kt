package ch01

import ch01.Color2.*


fun getWarmth(color: Color2) =
    when(color){
        RED,ORANGE,YELLOW -> "warm"
        GREEN -> "neutral"
        BLUE,INDIGO,VIOLET -> "cold"
    }

fun mix(c1 : Color2, c2: Color2) =
    when(setOf(c1, c2)) {
        setOf(RED, YELLOW) ->ORANGE
        setOf(YELLOW, BLUE) ->GREEN
        setOf(BLUE, VIOLET) ->INDIGO
        else -> throw Exception("Dirty colors")
    }

//setOf()
/*
코틀린에는 인자로 전달받은 여러객체를 포함하는 집합인 set 객체로 만들기 위한 함수
 원소의 순서는 중요하지 않다
*/

fun setOfTest(){
    var t1 = 1
    var t2 = 2
    println("${setOf(t1, t2) == setOf(2, 1)}")


}

fun main(args: Array<String>) {
    setOfTest()
}