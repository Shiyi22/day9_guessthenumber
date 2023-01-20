package sg.edu.nus.iss;

import java.util.Random;

public class SSP {

    public Integer generateComputerChoice() {
        Random rand = new Random(); 
        return rand.nextInt(3); 
    }
    
    public String checkWinner(Integer playerChoice, Integer computerChoice) {

        String winner = ""; 

        // if draw, return empty 
        playerChoice = playerChoice - 1; // to align playerchoice to 0 1 2 instead
        if (playerChoice.equals(computerChoice)) {
            // System.out.println("Tie");
            return ""; // return null allows the while loop in main to go again 
        }
        
        switch (playerChoice) {
            case 0: // Scissors
                if (computerChoice == 1) { winner = "Player"; } 
                else { winner = "Computer"; } // computer will be stone 
                break;
            case 1: // Paper 
                if (computerChoice == 2) { winner = "Player"; } 
                else { winner = "Computer"; } // computer will be stone 
                break; 
            case 2: // Stone   
                if (computerChoice == 0) { winner = "Player"; } 
                else { winner = "Computer"; } // computer will be stone 
                break; 
        }

        return winner; 

    }
}
