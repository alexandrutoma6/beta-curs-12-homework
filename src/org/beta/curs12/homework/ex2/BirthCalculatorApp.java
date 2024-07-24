package org.beta.curs12.homework.ex2;

import org.beta.curs12.homework.ex1.calculators.BirthYearCalculator;
import org.beta.curs12.homework.ex1.exceptions.InvalidAgeException;

import java.util.Scanner;

public class BirthCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        BirthYearCalculator calculator = null;

        while (!validInput) {
            try {
                System.out.print("Please input your age: ");
                int age = scanner.nextInt();
                System.out.print("Was your birthday this year (true/false): ");
                boolean birthdayAlreadyPassed = scanner.nextBoolean();

                calculator = new BirthYearCalculator(age,birthdayAlreadyPassed);
                validInput = true;

            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }

        int birthYear = calculator.calculateBirthYear();
        System.out.println("Your birth year is: " + birthYear);
    }
}
