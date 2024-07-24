package org.beta.curs12.homework.ex3.helpers;

import org.beta.curs12.homework.ex3.exceptions.DigitIndexException;

public class IntTools {
    private final int number;

    public IntTools(int number) {
        this.number = number;
    }

    public int digitSum(){
        int copyNumber = Math.abs(number);
        if(copyNumber < 10){
            return copyNumber;
        }

        int sum = 0;

        while(copyNumber > 0){
            sum += copyNumber %10;
            copyNumber/=10;
        }
        return sum;
    }

    public int lastDigit(){
        int copyNumber = Math.abs(number);
        return copyNumber % 10;
    }

    public int digitAt(int index) throws DigitIndexException {
        int copyNumber = Math.abs(number);
        char[] digits = Integer.toString(copyNumber).toCharArray();
        if (index < 0 || index >= digits.length) {
            throw new DigitIndexException("Index " + index + " is out of bounds for number " + number);
        }
        return digits[index] - '0';
    }
}
