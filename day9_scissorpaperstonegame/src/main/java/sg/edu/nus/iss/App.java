package sg.edu.nus.iss;

import java.util.Scanner;

public final class App {
    private App() {
    }
    // can modify the app to play more than once / play until player wins 
    public static void main(String[] args) {
        
        String[] choice = {"scissor", "paper", "stone"};
        String winner = ""; 
        int computerChoice, playerChoice; 
        Scanner scan = new Scanner(System.in); 

        SSP ssp = new SSP(); 
        computerChoice = ssp.generateComputerChoice(); // will generate 0 1 2 

        while (!winner.equals("Player")) {
            winner = ""; // reset winner to 0
            while (winner.equals("")) {
            
                System.out.println("Enter (1)Scissors, (2)Paper or (3)Stone: ");
                playerChoice = scan.nextInt(); 
    
                // making sure only 1-3 is keyed in as integer, else ask for input again 
                if (!(playerChoice >= 1 && playerChoice <= 3)) {
                    System.out.println("Invalid input: Only numbers 1, 2, or 3 allowed");
                    continue; 
                }
    
                winner = ssp.checkWinner(playerChoice, computerChoice); 
                if (winner.equals("")) {
                    System.out.println("It's a tie");
                } else {
                    System.out.println(winner + " wins!");
                }
            }
        }
        scan.close(); 
    }

    
}
