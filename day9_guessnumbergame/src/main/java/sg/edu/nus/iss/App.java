package sg.edu.nus.iss;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // program will run once in our case, we can alternatively tweak to let the program runs > 1
        Random rand = new Random(); 
        Integer guessNumber = rand.nextInt(100); 

        Integer myGuess = 0; 

        Scanner input = new Scanner(System.in);
        while (myGuess != guessNumber) {
            myGuess = input.nextInt();
            
            if (myGuess < guessNumber) {
                System.out.println("The number you guessed is lower");
            } else if (myGuess > guessNumber) {
                System.out.println("The number you guessed is higher");
            } else {
                System.out.println("You got it right!");
                input.close();
                System.exit(0); 
            }
        }

    }
}
