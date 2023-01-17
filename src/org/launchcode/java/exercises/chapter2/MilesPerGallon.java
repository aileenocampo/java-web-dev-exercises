package org.launchcode.java.exercises.chapter2;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gallon;
        double mpg;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles driven: ");
        miles = input.nextInt();

        System.out.println("Enter gallons of gas consumed: ");
        gallon = input.nextInt();

        mpg = miles / gallon;

        System.out.printf("Miles per gallon area is %d.", mpg);
    }
}
