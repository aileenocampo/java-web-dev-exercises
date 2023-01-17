package org.launchcode.java.exercises.chapter3;

import java.util.Arrays;

public class ArrayExercise {
    public static void main(String[] args) {
        int[] numberArray = {1, 1, 2, 3, 5, 8};

        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] % 2 == 1) {
                System.out.println(numberArray[i]);
            }
        }

        String sentence = "I would not, could not, in a box. I would not, " +
                "could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse";

        String[] stringArray = sentence.split(" ");

        System.out.println(Arrays.toString(stringArray));

        stringArray = sentence.split("\\.");

        System.out.println(Arrays.toString(stringArray));
    }

}
