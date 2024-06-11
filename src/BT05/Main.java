package BT05;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("Ten : " + StaticMethod.name);
        System.out.println("Tuoi: " + StaticMethod.age);

        StaticMethod.showInfo();

        //Khoi tao doi tuong
        StaticMethod staticMethod = new StaticMethod();
        System.out.println("Ten :" + staticMethod.name);
        System.out.println("Tuoi: " + staticMethod.age);

        staticMethod.showInfo();
    }
}
