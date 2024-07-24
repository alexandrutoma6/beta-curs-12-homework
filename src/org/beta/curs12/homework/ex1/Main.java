package org.beta.curs12.homework.ex1;

import org.beta.curs12.homework.ex1.calculators.BirthYearCalculator;
import org.beta.curs12.homework.ex1.exceptions.InvalidAgeException;

public class Main {
    public static void main(String[] args) throws InvalidAgeException {

        BirthYearCalculator calculator = new BirthYearCalculator(21, false);
        int birthYear = calculator.calculateBirthYear();
        System.out.println("Your birth year is: " + birthYear);

    }
}
