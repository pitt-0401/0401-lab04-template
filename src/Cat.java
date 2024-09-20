/*
 * Created on 2026-09-21
 *
 * Copyright (c) 2026 Nadine von Frankenberg
 */

// LAB04 template — CMPINF 0401, Fall 2026
// Use this if your LAB03 solution is incomplete. It compiles and runs as is.

public class Cat {

    // TODO 1: Make cat instantiable
    // TODO 1.1a: Define the cat's characteristics as instance variables
    // TODO 1.1b: Remove the "static"s below and adapt the methods
    // TODO 1.1c: Add a constructor

    static int furnitureDestroyed = 0;

    static String destroyFurniture() {
        furnitureDestroyed = furnitureDestroyed + 1;
        return "Total pieces of furniture destroyed: " + furnitureDestroyed;
    }

    static String describeCat(String name, int age) {
        return "My cat " + name + " is " + age + " years old.";
    }

    static String createFunnyStory(String name, String story) {
        return "My cat " + name + " " + story;
    }

    static String introduceCat(String name, int age, String story) {
        return describeCat(name, age) + "\n"
                + createFunnyStory(name, story) + "\n"
                + destroyFurniture();
    }

    static String classifyAge(int age) {
        if (age <= 1) {
            return "Kitten";
        } else if (age <= 10) {
            return "Adult";
        } else {
            return "Senior";
        }
    }

    static String recommendActivity(int age, int energyLevel) {
        boolean isSenior = age >= 11;

        if (energyLevel >= 7 && !isSenior) {
            return "High-energy activity (e.g., running, climbing)";
        } else if (energyLevel >= 4) {
            return "Moderate-energy activity (e.g., chasing a toy)";
        } else {
            return "Low-energy activity (e.g., napping, bird watching)";
        }
    }

    // TODO 1.2: Implement wantsToPlay()

    // TODO 1.3: Implement play()

    // TODO 1.4: Implement custom String representation (toString())
}
