package org.launchcode.java.exercises.chapter2;

import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        int length;
        int width;
        int area;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of rectangle:");
        length = input.nextInt();

        System.out.println("Enter width of rectangle:");
        width = input.nextInt();

        area = length * width;

        System.out.printf("Rectangle area is %d.", area);
    }
}
