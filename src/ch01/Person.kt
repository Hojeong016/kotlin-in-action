package ch01

data class Person(val name: String, val age: Int? = null)

//뒤에 있는 괄호안에는 무엇을 넣는 걸까?
// int 옆에 물음표? : 코틀린의 타입 시스템
// 실행 시점에서 nullpointException이 발생될 수 있는 연산을 사용하는 코드를 금지한다.
// 어떤 타입이 널이 될 수 있는지 ? 를 추가로 표시
// age는 널이 될 수 있다.

fun main(args: Array<String>) {
    val person = listOf(Person("영희"), Person("철수", age = 29))
    val oldest = person.maxBy{it.age ?:0}
    println("나이가 가장 많은 사람: $oldest")
    //결과 나이가 가장 많은 사람: Person(name=철수, age=29)
}
// {it.age ?:0} -> 람다식 /it 을 사용하면 별도의 파라미터 이름을 지정하지 않아도 된다. / ?: -> 엘비스 연산자. : null = 0 / not null = age
// list.of
