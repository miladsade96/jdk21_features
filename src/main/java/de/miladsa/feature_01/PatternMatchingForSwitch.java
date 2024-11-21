package de.miladsa.feature_01;

import java.util.Scanner;

public class PatternMatchingForSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yes or No: ");
        String response = scanner.nextLine();

        switch (response) {
            case "yes", "yep", "yeah" -> System.out.println("You said yes ;)");
            case "no", "nope", "noo" -> System.out.println("You said no :(");
            default -> System.out.println("Please choose!");
        }
    }
}
