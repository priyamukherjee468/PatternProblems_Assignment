package org.example;

public class Pattern27 {
    public static void main(String[] args) {

        int n = 5;
        int nsp=n-1;
        int nst=1;

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= nsp ; j++) {
                    System.out.print("  ");
                }
            for (int j = 1; j <=nst/2 ; j++) {
                System.out.print(j+" ");
            }
            for (int j=nst/2-1;j>0; j--) {
                System.out.print(j+" ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}
