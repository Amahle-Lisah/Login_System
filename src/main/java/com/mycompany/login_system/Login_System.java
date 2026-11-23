package com.mycompany.login_system;

import java.util.Scanner;

/**
 * This is the main class. It asks the user to register, then asks
 * them to log in with the details they just registered.
 *
 * @author Amahle Lisah Khumalo
 */
public class Login_System {

    public static void main(String[] args) {
        // The Registration object stores the details and checks the login
        Registration registration = new Registration();
        Scanner input = new Scanner(System.in);

        // Registration
        System.out.println("=== REGISTRATION ===");
        System.out.println("Choose a Username:");
        String newUsername = input.nextLine();

        System.out.println("Choose a Password:");
        String newPassword = input.nextLine();

        // Save the details in the Registration object
        registration.registerUser(newUsername, newPassword);
        System.out.println("Registration successful!");
        System.out.println();

        // Login
        System.out.println("=== LOGIN ===");
        boolean loggedIn = false;

        // Keep asking until the user logs in correctly
        while (!loggedIn) {
            System.out.println("Enter your Username:");
            String enteredUsername = input.nextLine();

            System.out.println("Enter your Password:");
            String enteredPassword = input.nextLine();

            // Registration checks the details, so the check is not repeated here
            if (registration.checkLogin(enteredUsername, enteredPassword)) {
                System.out.println("Login Successful, Welcome: " + registration.getUsername());
                loggedIn = true;
            } else {
                System.out.println("Invalid username or password. Please try again!");
            }
        }

        input.close(); // Close the scanner
    }
} //end of class