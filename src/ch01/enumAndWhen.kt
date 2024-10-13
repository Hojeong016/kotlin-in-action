package ch01

fun main(args: Array<String>) {
    println(Color2.BLUE)
    println(getMnemonic(Color2.BLUE))
}

fun getMnemonic(color: Color2) =
    when(color){
        Color2.RED -> "Richard"
        Color2.ORANGE -> "Of"
        Color2.YELLOW -> "York"
        Color2.GREEN -> "Gave"
        Color2.BLUE -> "Battle"
        Color2.INDIGO -> "In"
        Color2.VIOLET -> "Vain"
    }

//break문을 사용하지 않아도 된다.
// 성공적으로 매치 되는 분기를 찾으면 swich는 그 분기를 실행한다.