package com.patterns;

import java.util.Scanner;

public class Triangle {
    private int n;

    public void printOneAsterisk() {
        System.out.println("Print one Astrisk");
        System.out.println("------------------------------------------------------------------");
        System.out.println("*");
    }

    public void printHorizontalLine() {
        System.out.println("Enter the value if n");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("Print Horizontal line");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public void printVerticalLine() {
        System.out.println("Enter the value if n");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("Print vertical line");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
    public void printRightTriangleLine() {
        System.out.println("Enter the value if n");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("Print Right triangle");
        System.out.println("------------------------------------------------------------------");
        for (int i = 1; i <= n; i++) {
            for(int j=1; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

