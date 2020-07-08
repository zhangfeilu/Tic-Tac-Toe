package Demo.Tic_Tac_Toe;

import java.util.Scanner;

public class Player {
	private String _symbol;
	private ChessBoard _chessBoard;
	
	public Player(String _symbol, ChessBoard _chessBoard) {
		this._symbol = _symbol;
		this._chessBoard = _chessBoard;
	}
	
    private int[] getUserInput() {
    	System.out.println("Hi "+_symbol+" Please Input the Location(e.g. by entering 1,2 mean row 1, column2):");
    	// TODO: we should check the input before we use it
    	Scanner sc = new Scanner(System.in);
    	String str1 = sc.next();
    	int[] ret = new int[2];
    	for(int i=0; i<2; i++) {
    		ret[i] = Integer.valueOf(str1.split(",")[i]);	
    	}
    	return ret;
    	//System.out.println("Input:" + str1);
    }
    
	public void setChoice() {
		int[] ret = getUserInput();
		_chessBoard.setChoice(ret[0], ret[1], this);
	}

	public String get_symbol() {
		return _symbol;
	}

	public ChessBoard get_chessBoard() {
		return _chessBoard;
	}
}
