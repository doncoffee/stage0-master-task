package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year >= 0 && month > 0 && month < 13) {
            String february = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "29" : "28";
            switch (month) {
                case 4, 6, 9, 11 -> System.out.println("30");
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
                case 2 -> System.out.println(february);
            }
        } else {
            System.out.println("invalid date");
        }
    }
}
