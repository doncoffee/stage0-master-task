package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        String str = String.valueOf(number);
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += number % 10;
            number /= 10;
        }
        System.out.println(result);
    }
}
