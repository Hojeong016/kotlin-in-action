package ch01
//클래스 안에 꼭 함수를 감싸지 않아도 된다.
fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "kotlin"
    println("hello  $name") // 세미콜론 x && 자바 라이브러리 함수를 간결하게 사용할 수 있도록 하는 래퍼 제공
    println("{$name}님 반가워요 ") // 이런 형식을 더 지향하자


    println("hello,${if(args.size > 0) args[0] else "kotlin"}!") // 중괄호를 둘러싼 식안에 "" 사용해보기


    println(max(1,2))
}

// String name = "kotlin";
//    if(args.size > 0){
//        name = args[0];
//        return name;
//    }else{
//        return name;
//    }

//리턴 타입 지정
//fun : 함수 지정 / max : 함수 이름 / () : 파라미터 목록  / : Int - 반환 타입
fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
    //코틀린에서의 if 는? '문'이아니라'식'이다.
}

fun value(void: Void){
    //var : 변경 가능 참조
    var age = 5;
    var name = "이름을 작성해주세요"

    //val : 불변 변수
    val date : Int
}


