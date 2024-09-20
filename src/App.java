/*
 * Created on 2026-09-21
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// LAB04 template — CMPINF 0401, Fall 2026

import java.util.Scanner;

public class App {

    // Note: No need to change the scanner instantiation
    static Scanner keyboard = new Scanner(System.in);

    // Note: No need to change readUserText(...)!
    static String readUserText(String prompt) {
        System.out.print(prompt);
        return keyboard.nextLine();
    }

    // Note: No need to change readUserNumber(...)!
    static int readUserNumber(String prompt, int min, int max) {
        System.out.print(prompt);
        int number = keyboard.nextInt();
        keyboard.nextLine(); // consume the leftover newline

        if (number < min || number > max) {
            int defaultNumber = (min + max) / 2; // can also be hard-coded
            System.out.println("Error: value must be between " + min + " and " + max
                    + ". Defaulting to " + defaultNumber + ".");
            number = defaultNumber;
        }
        return number;
    }

    // TODO 2: Create and use cat objects
    // TODO 2.1: Implement promptForCat()
    public static void main(String[] args) {
        System.out.println("Welcome to CatTales!");
        System.out.println("--------------------");

        // TODO 2.2: Create at least two cats
        // TODO 2.3: Print each cat's description
        // TODO 2.4: Let each cat play and print whether it played
        // TODO 2.5: Print both cats' descriptions again
        // Note: the Cat.xxx(...) calls below will stop compiling once Cat is
        // instantiable!
        // It is recommended to comment that out first, then build your program up
        // step-by-step (see numbered TODOs).
        String name = readUserText("What is your cat's name? ");
        int age = readUserNumber("How old is " + name + "? ", 0, 30);
        String story = readUserText("Tell me a funny story about " + name + ": ");
        int energyLevel = readUserNumber("How energetic is " + name + "? ", 1, 10);

        System.out.println("----------");
        System.out.println(Cat.introduceCat(name, age, story));
        System.out.println("Age category: " + Cat.classifyAge(age));
        System.out.println("Recommended activity: " + Cat.recommendActivity(age, energyLevel));

        keyboard.close();
    }
}
