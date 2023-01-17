package org.launchcode.java.exercises.chapter3;

import java.util.ArrayList;

public class ArrayListExercise {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();

        numList.add(10);
        numList.add(12);
        numList.add(9);
        numList.add(5);
        numList.add(25);
        numList.add(2);
        numList.add(3);
        numList.add(24);
        numList.add(14);
        numList.add(11);

        int total = evenSum(numList);

    }

    public static int evenSum(ArrayList<Integer> numList) {
        int total = 0;

        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) % 2 == 1) {
                total += numList.get(i);
            }
        }

        return total;
    }
}
