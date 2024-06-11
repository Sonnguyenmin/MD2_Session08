package BT02;

import BT02.raacademy.Car;
import BT02.raacademy.Motorcycle;

public class Main {
    public static void main(String[] args) {
        //Khoi tao doi tuong tu cac lop con
        Car car1 = new Car("Toyota", "black");
        Car car2 = new Car("Ford", "white");
        //Truy cap cac phuong thuc cua lop cha nhu set/get

        System.out.println("Car 1's brand is "+ car1.getBrand());
        // Hien thi thong tin cua xe o to
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        Motorcycle motor1 = new Motorcycle("Honda", "red-white");
        Motorcycle motor2 = new Motorcycle("Vinfast", "blue");
        //Hien thi thong tin cua xe may
        System.out.println(motor1.toString());
        System.out.println(motor2.toString());
    }
}
