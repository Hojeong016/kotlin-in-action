package ch01

//enum
enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

//프로퍼티, 메서드 존재 enum
enum class Color2(val r : Int, val g : Int, val b : Int){
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(75, 0, 135);

    fun rgb() = (r * 256 + g) * 256 + b // enum 클래스 안에 메서드
}

fun main(args: Array<String>) {
    println(Color2.RED.rgb())
}
