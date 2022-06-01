package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] input = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = input[0];
        int columns = input[1];

        String[][] matrix = new String[rows][columns];
        charsToPrint(matrix,rows,columns);
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }

    }
    public  static  void charsToPrint(String[][] matrix,  int rows, int columns){
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns ; column++) {
                char firstChar = (char) ('a' + row);
                char middleChar = (char) (firstChar + column);
                matrix[row][column] = String.valueOf(firstChar) + middleChar + firstChar;
            }
        }
    }
}
