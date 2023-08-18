package org.example;

import java.util.Scanner;

public class Pattern26 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <=n; i++) {
            int val=0;
            for (int j = 1; j <= n-i ; j++) {

                    System.out.print("  ");
                }
            for (int j = 1; j <2*i ; j++) {
                val++;
                    System.out.print(val+" ");

            }
                System.out.println();





        }
    }
}
