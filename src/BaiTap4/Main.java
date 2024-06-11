package BaiTap4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side 2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side 3: ");
        double side3 = scanner.nextDouble();
        scanner.nextLine(); // consume newline character

        System.out.print("Enter color: ");
        String color = scanner.nextLine();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);

        System.out.println("Triangle information:");
        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}
