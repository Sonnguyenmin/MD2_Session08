package BT01;

import BT01.rikkeiacademy.Animal;
import BT01.rikkeiacademy.Cat;
import BT01.rikkeiacademy.Dog;

public class Main {
    public static void main(String[] args) {
        //Tao cac doi tuong tu cac lop
        Animal animal01 = new Animal("Pig");
        Dog dog01 = new Dog("Becgie", "black");
        Dog dog02 = new Dog("Pug", "white");
        Cat cat = new Cat("Dora");
        //Dung cac phuong thuc get / set truy cap va thay doi thuoc tinh
        System.out.println("Animal01's name is " + animal01.getName());
        animal01.setName("Bird");
        System.out.println("Animal01's name is " + animal01.getName());
        //TRuy cap phuong thuc duoc ke thua tu lop cha
        dog01.setName("Corgi");
        System.out.println("Name : " + dog01.getName());
        System.out.println("Sound : " + dog01.makeSound());
        System.out.println("Color : " + dog02.getColor());
        System.out.println("Name : " + cat.getName());
        System.out.println("Sound : " + cat.makeSound());
    }
}
