package org.launchcode.java.studios.studio3;

import java.util.ArrayList;

public class CountingClass {
    public static void main(String[] args) {
        // I understand HashMap is the best way to implement
        ArrayList<Character> charList = new ArrayList<>();
        ArrayList<Integer> numList = new ArrayList<>();

        String quote = "If the product of two terms is zero then common sense " +
                "says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the " +
                "quadratics into a form that can be factored allowing that side " +
                "of the equation to equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";

        char[] charactersInString = quote.toCharArray();

        char currentChar;
        int count;

        for (int i = 0; i < charactersInString.length; i++) {
            currentChar = charactersInString[i];

            if (!charList.contains(currentChar)) {
                charList.add(currentChar);
            }
        }

        for (int i = 0; i < charList.size(); i++) {
            currentChar = charList.get(i);
            count = 0;

            for (int j = 0; j < charactersInString.length; j++) {
                if (currentChar == charactersInString[j]) {
                    count++;
                }
            }

            numList.add(count);
        }

        for (int i = 0; i < charList.size(); i++) {
            System.out.printf("%c: %d\n", charList.get(i), numList.get(i));
        }
    }
}
