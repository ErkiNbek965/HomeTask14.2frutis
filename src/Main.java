public class Main {
    public static void main(String[] args) {

        Fruits fruits = new Fruits("Pomegranate",12);
        Banana banana = new Banana(3);
        Apple apple = new Apple("Fruits",3,new Banana(10),15);
        Orange orange = new Orange("Fruits",12,new Banana(4),"Orange");
        System.out.println(fruits);
        System.out.println(banana);
        System.out.println(apple);
        System.out.println(orange);
    }
}