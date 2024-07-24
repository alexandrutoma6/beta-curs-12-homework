package org.beta.curs12.homework.ex1.calculators;

import org.beta.curs12.homework.ex1.exceptions.InvalidAgeException;

import java.time.Year;

public class BirthYearCalculator {
    private final Integer age;

    public BirthYearCalculator(Integer age) throws InvalidAgeException {
        if (age <= 0) {
            throw new InvalidAgeException("Age must be a positive integer.");
        }
        this.age = age;
    }

    public Integer calculateBirthYear() {
        Year currentYear = Year.now();
        int currentYearValue = currentYear.getValue();
        return currentYearValue - age;
    }
}
