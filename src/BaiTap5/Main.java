package BaiTap5;

public class Main {
    public static void main(String[] args) {

        double circleArea = StaticMethod.calCircleArea(5.0);
        double rectangleArea = StaticMethod.calRectangleArea(10.0, 5.0);
        double triangleArea = StaticMethod.calTriangleArea(3.0, 4.0, 5.0);
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Triangle Area: " + triangleArea);

    }
}
