package BT04;

import BT04.ra.Circle;
import BT04.ra.Rectangle;
import BT04.ra.Shape;

public class Main {
    public static void main(String[] args) {
        //Kiểm thử Class Shape
        System.out.println("---------SHAPE----------");
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
//kiểm thử Class Circle
        System.out.println("---------CIRCLE----------");
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
//Kiểm thử RECTANGLE
        System.out.println("---------RECTANGLE----------");
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle);
    }
}
