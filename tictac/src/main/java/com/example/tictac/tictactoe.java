package com.example.tictac;

import java.util.Scanner;

public class tictactoe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        while (true) {
            printBoard(board);

            System.out.print("Wähle ein Feld (1-9) ");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("Spiel beendet.");
                break;
            }


            if (n < 1 || n > 9) {
                System.out.println(" Zahl von 1 bis 9 eingeben!");
                continue;
            }


            int row = (n - 1) / 3;
            int col = (n - 1) % 3;


            if (board[row][col] != ' ') {
                System.out.println("womp womp");
                continue;
            }

            
            board[row][col] = 'X';


        }




    }

    static void printBoard(char[][] board) {
        int field = 1;

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                char out = (board[row][col] == ' ')
                        ? (char) ('0' + field)
                        : board[row][col];

                System.out.print(" " + out + " ");
                if (col < 2) System.out.print("|");

                field++;
            }

            System.out.println();
            if (row < 2) System.out.println("---+---+---");
        }
    }
}

