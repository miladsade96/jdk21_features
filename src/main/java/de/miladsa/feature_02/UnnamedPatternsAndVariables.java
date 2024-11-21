package de.miladsa.feature_02;

import java.util.Scanner;

public class UnnamedPatternsAndVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dear user, please enter your input: ");
        String userInput = scanner.nextLine();

        try {
            int usersInput = Integer.parseInt(userInput);
            System.out.println("User input is: " + usersInput);
        } catch (NumberFormatException _) {
            System.out.println("Invalid input: " + userInput);
        }
    }
}
