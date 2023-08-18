package org.example;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (i * 2) - 1; j++) {

                    System.out.print("* ");
                }
                System.out.println();


            for (int k = n; k >= i; k--) {

                System.out.print("  ");
            }


        }
    }
}
