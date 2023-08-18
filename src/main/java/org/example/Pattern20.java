package org.example;


import java.util.Scanner;

public class Pattern20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,mid;
        if(n%2==1)
            n++;
        mid = n/2;

        // upper half pattern
        for(i = 1; i<= mid; i++) {
            for(j = 1; j<=mid-i; j++)
                System.out.print(" ");

            if(i == 1) {
                System.out.print("*");
            }else{
                System.out.print("*");
                for(j = 1; j<=2*i-3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            for(j = 1; j<=mid-i; j++)
                System.out.print(" ");

            System.out.println();
        }
        for(i = mid+1; i<n; i++) {

            for(j = 1; j<=i-mid; j++)
                System.out.print(" ");

            if(i == n-1) {
                System.out.print("*");
            }else{
                System.out.print("*");
                for(j = 1; j<=2*(n - i)-3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            for(j = 1; j<=i-mid; j++)
                System.out.print(" ");

            System.out.println();
        }

    }

    }

