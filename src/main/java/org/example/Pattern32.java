package org.example;

public class Pattern32 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=2*i-1; j++) {
                if (j%2==1) {
                    System.out.print(i+"  ");
                } else {
                    System.out.print("*  ");

                }
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {

            for (int j = 1; j <=2*i-1; j++) {
                if (j%2==1) {
                    System.out.print(i+"  ");
                } else {
                    System.out.print("*  ");

                }
            }
            System.out.println();
        }
    }
}
