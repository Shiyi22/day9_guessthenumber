package sg.edu.nus.iss;

import java.util.Arrays;

public class TicTacToe {

    // function to print tic tac toe board 
    public void printBoard (String[] board) {
        // every 3 numbers, line break
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");

        System.out.println("-------------");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");

        System.out.println("-------------");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    // function to check for winner 
    public String checkWinner (String[] board) {
        
        String line = "", winner = ""; 
        // loop this 8 times for 8 possible permutation of winning 
        int i = 0; 
        while (i < 8) {
            switch (i) {
                case 0: line = board[0] + board[1] + board[2]; 
                    break; 
                case 1: line = board[3] + board[4] + board[5]; 
                    break; 
                case 2: line = board[6] + board[7] + board[8]; 
                    break; 
                case 3: line = board[0] + board[3] + board[6]; 
                    break; 
                case 4: line = board[1] + board[4] + board[7]; 
                    break; 
                case 5: line = board[2] + board[5] + board[8]; 
                    break;
                case 6: line = board[0] + board[4] + board[8]; 
                    break; 
                case 7: line = board[2] + board[4] + board[6]; 
                    break; 
            }
            i++;

            if (line.equals("XXX")) { 
                winner = "X"; // player X wins 
                i = 9; // to break out of the while loop 
            } else if (line.equalsIgnoreCase("OOO")) {
                winner = "O"; // player O wins 
                i = 9; // to break out of the while loop 
            } else {
                for (int a = 0; a < 9; a++) {
                    if (Arrays.asList(board).contains(String.valueOf(a + 1))) { // check whether the grid contains any numeric number 
                        break; // break from the for loop if there is still number >> meaning not filled 
                    } else if (a == 8) {
                        winner = "draw"; 
                    }
                }
                 
            }
        }
        return winner;
    }
    
}
