package ch01

//코드 없이 데이터만 저장하는 클래스
// 변환기를 사용해보자
//- 자바 → 코틀린 변환기 사용방법
//매뉴 > code > convert java file to kotlin
/*public class PersonJava {
    private final String name;

    public PersonJava(String name) {
        this.name = name;    }

    public String getName() {
        return name;}
}*/

class PersonJava(val name: String)
//코틀린의 기본 가시성은 public 이기 때문에 생략
//: -> 초기 데이터 값 지정

