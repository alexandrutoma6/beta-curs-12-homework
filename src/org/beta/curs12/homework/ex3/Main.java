package org.beta.curs12.homework.ex3;

import org.beta.curs12.homework.ex3.exceptions.DigitIndexException;
import org.beta.curs12.homework.ex3.helpers.IntTools;

public class Main {
    public static void main(String[] args) throws DigitIndexException {
        IntTools tool = new IntTools(-123456);

        System.out.println(tool.digitAt(3));
        System.out.println(tool.digitSum());
        System.out.println(tool.lastDigit());
    }
}
