package Demo.Tic_Tac_Toe;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
 
    public static void main( String[] args )
    {   
    	ChessBoard board = new ChessBoard();
    	Player player_O = new Player("O", board);
    	Player player_X = new Player("X", board);
    	boolean player_O_choice = true;
    	while(!board.isGameOver()) {
    		if(player_O_choice) {
    			player_O.setChoice();
    			player_O_choice = false;
    		} else {
    			player_X.setChoice();
    			player_O_choice = true;
    		}
    		board.printBoard();
    	}
    	if(board.hasWinner()) {
    		if(player_O_choice) {
    			System.out.println("Player X is the winner!");
    		} else {
    			System.out.println("Player O is the winner!");
    		}
    	} else if(board.boardIsFull()) {
    		System.out.println("The game is over and we have no winner!");
    	}
    	
    }    

}
