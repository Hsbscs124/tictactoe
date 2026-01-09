package com.example.tictac;

public class tictactoe {

    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };



        printBoard(board);
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

