class Pizza{
    static int size;
    static String type;

    private Pizza(){
        size = 13;
        type = "슈퍼 파파스";
    }
    // static 은 "고정된" 이라는 의미로 객체 생성없이 사용할수 있는 필드나 메소드를 생성할때 사용
    // 필드나 메소드를 객체마다 다르게 가져야 한다면 인스턴스로 생성하고 공용데이터 라면 static으로 선언
    // 사용하기 위해서는 클래스 내의 필드나 메소드 앞에 static키워드를 붙여주면 된다.
    public static Pizza makePizza(){
        Pizza obj2 = new Pizza();
        obj2.size = 14;
        return obj2;
    }
}

public class Main {

    public static void main(String[] args){

        Pizza objP = Pizza.makePizza();
        System.out.println(objP.size);
        // Pizza obj1 = new Pizza();
        // System.out.println("("+obj1.type + "," + obj1.size + ")");

    }

}
