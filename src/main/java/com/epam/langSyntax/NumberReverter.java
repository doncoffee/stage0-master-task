package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String str = String.valueOf(number);
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = str.charAt(i) + result;
        }
        System.out.println(result);
    }
}
