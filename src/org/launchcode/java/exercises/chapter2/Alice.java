package org.launchcode.java.exercises.chapter2;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
         String sentence = "Alice was beginning to get very tired of sitting" +
                " by her sister on the bank, and of having nothing to do: once or" +
                " twice she had peeped into the book her sister was reading, but" +
                " it had no pictures or conversations in it, 'and what is the use of" +
                " a book,' thought Alice 'without pictures or conversation?'";

        String term;
        int index;
        int length;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter term to search:");
        term = input.next();

        if (sentence.contains(term)) {
            index = sentence.indexOf(term);
            length = term.length();

            sentence = sentence.replace(term, "");

            System.out.printf("Term first appears at index %d. The length of '%s' is %d.\n",
                    index, term, length);
            System.out.printf("Modified sentence:\n%s", sentence);
        } else {
            System.out.println("false -- NOT IN SENTENCE");
        }
    }
}
