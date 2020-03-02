package com.testinium;

import java.util.Scanner;

public class treeAlgorithm {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            Integer x = scanner.nextInt();

            for (int i = 0; i <= x; i++) {

                for (int j = x - 1; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println("You Must Enter a Integer Value !!!  "+e);
        }

    }
}