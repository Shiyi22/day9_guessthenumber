package sg.edu.nus.iss;

import java.util.Currency;
import java.util.Scanner;

public final class App {
    private App() {
    }
    public static void main(String[] args) {
        
        String[] tttBoard = new String[9]; // to store the tic tac toe 
        // Player X and O
        String player = "X"; 
        String winner = ""; 
        
        // label the grids 1-9 
        for (int i = 0; i < tttBoard.length; i++) {
            tttBoard[i] = String.valueOf(i + 1); 
        }
        // print out the initial tic tac toe board that shows 1-9
        TicTacToe ttt = new TicTacToe(); 
        ttt.printBoard(tttBoard);

        System.out.println();
        System.out.println("Tic-Tac-Toe game");
        System.out.println("----------------");
        System.out.println("X will play first");

        // Player X keys in an int 1-9
        Scanner scan = new Scanner (System.in);
        System.out.println("> key in a grid number 1-9");
        // Loop through until a winner is found  
        while (winner == "") {
            // logic of playing tic tac toe here  
            System.out.println("Player " + player + " enter your move (grid number)");

            int input = scan.nextInt();  
            // check for correct number inputted
            if ((input > 0) && (input < 10)) {
                
            } else {
                System.out.println("Invalid input: Only number 1 to 9 is allowed.");
                continue; // go back to get valid input 
            }
            
            // change current player, if board 
            if ((tttBoard[input - 1]).equals(String.valueOf(input))) { // initial board 0 not filled up 
                // update the board with the move X or O 
                tttBoard[input - 1] = player; 
                // switch players (alternate)
                player = (player == "X") ? "O": "X"; 
            } else {
                System.out.println("Position already taken up. Please enter another grid number.");
            }
            ttt.printBoard(tttBoard);
            winner = ttt.checkWinner(tttBoard);

            if (winner.equalsIgnoreCase("draw")) {
                System.out.println("It's a draw!");
            } else {
                System.out.println("The winner of this game is " + winner);
            }
        }
        scan.close();     
    }
}
