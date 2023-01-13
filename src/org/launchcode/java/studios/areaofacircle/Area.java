package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        final double PI = 3.14;

        double radius;
        double area;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius of circle: ");
        radius = input.nextDouble();

        area = Circle.getArea(radius);

        System.out.printf("The area of a circle of radius 2.5 is: %f", area);
    }
}
