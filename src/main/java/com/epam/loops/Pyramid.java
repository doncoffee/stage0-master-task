package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = cathetusLength; j > i; j--){
                System.out.print(" ");
            }
            for (int k = i; k >= 2; k--){
                System.out.print(k);
            }
            for (int l = 1; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
