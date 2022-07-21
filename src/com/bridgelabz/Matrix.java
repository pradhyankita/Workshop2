package com.bridgelabz;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int matrix1[][] = new int[2][2];
        int matrix2[][] = new int[2][2];
        int sum[][] = new int[2][2];
        Scanner r = new Scanner(System.in);
        System.out.println("Enter the first matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = r.nextInt();
            }
        }
        System.out.println("Enter the second matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = r.nextInt();
            }
        }
        System.out.println("first matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(matrix1[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("second matrix: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(matrix1[i][j] + " ");
            }
            System.out.println("\n");
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matrix1[i][j] % 2 == 0 && matrix2[i][j] % 2 == 0) {
                    System.out.println("Both matrices are even!");
                    System.out.println("Sum of matrix: ");
                    for (i = 0; i < 2; i++) {
                        for (j = 0; j < 2; j++) {
                            sum[i][j] = matrix1[i][j] + matrix2[i][j];
                            System.out.println(sum[i][j] + " ");
                        }
                        System.out.println("\n");
                    }
                } else {
                    System.out.println("Both matrices are odd!");
                    System.out.println("multiplication of matrix: ");
                    for ( i = 0; i < 2; i++) {
                        for ( j = 0; j < 2; j++) {
                            sum[i][j] = matrix1[i][j] * matrix2[i][j];
                            System.out.println(sum[i][j] + " ");
                        }
                        System.out.println("\n");
                    }

                }
            }
        }
    }
}
