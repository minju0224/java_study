package 예제;

public class VarDemo {
    // var a= 1; -> var은 메소드 내부에서만 사용할 수 있다.
    public static void main(String[]args){
        int var = 1; //var을 변수 이름으로 사용할 수 있다.
        var x = 1;
        // var x = 1, y = 3, z = 4; -> var을 사용하여 다수의 변수를 하나의 실행문으로 초기화 할 수 없음.
        // var str = null; -> var 변수에 null을 대입할 수 없다.
        // var oops;  -> var 변수를 바로 초기화하지 않으면
        // oops = 1;     타입을 추론할 수 없다.
    }

    // void test (var x) { } -> 10행처럼 변수 X의 타입을 추론할 수 없다.
}
