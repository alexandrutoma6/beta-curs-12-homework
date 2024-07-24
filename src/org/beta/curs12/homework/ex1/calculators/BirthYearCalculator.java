package org.beta.curs12.homework.ex1.calculators;

import org.beta.curs12.homework.ex1.exceptions.InvalidAgeException;
import java.time.Year;

public class BirthYearCalculator {
    private final int age;
    private final boolean birthdayAlreadyPassed;

    public BirthYearCalculator(int age, boolean birthdayAlreadyPassed) throws InvalidAgeException {
        if (age <= 0) {
            throw new InvalidAgeException("Age must be a positive integer.");
        }
        this.age = age;
        this.birthdayAlreadyPassed = birthdayAlreadyPassed;
    }

    public int calculateBirthYear() {
        Year currentYear = Year.now();
        int currentYearValue = currentYear.getValue();

        if (birthdayAlreadyPassed) {
            return currentYearValue - age;
        } else {
            return currentYearValue - age - 1;
        }
    }
}
