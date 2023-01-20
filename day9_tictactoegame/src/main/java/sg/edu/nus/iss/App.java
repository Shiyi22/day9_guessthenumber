package sg.edu.nus.iss;

public final class App {
    private App() {
    }
    public static void main(String[] args) {
        
        String[] tttBoard = new String[9]; // to store the tic tac toe 
        // Player X and O
        String player1 = "X"; 
        String player2 = "O"; 
        
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

        

    }
}
