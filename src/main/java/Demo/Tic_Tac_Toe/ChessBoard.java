package Demo.Tic_Tac_Toe;

public class ChessBoard {
	private String[][] _board;

	public ChessBoard() {
		_board = new String[3][3];
		initBoard();
	}
	
	public void setBoard(String[][] b) {
		this._board = b;
	}
	
	public void setChoice(int row, int col, Player p) {
		// check the input value
		if(row>2 || row <0 || col>2 || col<0 || _board[row][col]!=" ") {
			String msg = "inval row and col value, both row and col should beween 0 and 2";
			if(_board[row][col]!=" ") {
				msg =String.format("the location of {0},{1} is already used, please choose another one", row, col);
			}
			throw new RuntimeException(msg);
		}
		
		_board[row][col] = p.get_symbol();
	}
	
	public boolean isGameOver() {
		return boardIsFull() || hasWinner();
	}
	
	public boolean boardIsFull() {
		boolean ret = true;
		// we can use stream api in java8 to improve the code
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(_board[i][j] == " ") {
					return false;
				}
			}
		}
		return ret;
	}
	
	public boolean hasWinner() {
    	// check the rows
    	for(int i=0; i<3; i++) {
    		if(_board[i][0]!=" "
    				&&_board[i][0]==_board[i][1]
    				&&_board[i][1]==_board[i][2]) {
    			return true;
    		}
    	}
    	// check the columns
    	for(int i=0; i<3; i++) {
    		if(_board[0][i]!=" "
    				&&_board[0][i]==_board[1][i]
    				&&_board[1][i]==_board[2][i]) {
    			return true;
    		}
    	}
    	// check the diagonal
    	if(_board[0][0]!=" " 
    			&& _board[0][0]==_board[1][1]
    			&& _board[1][1]==_board[2][2]) {
    		return true;
    	}
    	
    	if(_board[0][2]!=" " 
    			&& _board[0][2]==_board[1][1]
    			&& _board[1][1]==_board[2][0]) {
    		return true;
    	}
    	
    	return false;
    }
	
	public String[][] get_board() {
		return _board;
	}
    
    private void initBoard() {
    	for(int i=0; i<3; i++) {
    		for(int j=0; j<3; j++) {
    			_board[i][j] = " ";
    		}
    	}
    }
    
    public void printBoard() {
    	StringBuilder board  = new StringBuilder();
    	for(int i=0; i<3; i++) {
    		for(int j=0; j<3; j++) {
    			board.append(_board[i][j]);
    		}
    		board.append("\n");
    	}
    	System.out.println(board.toString());
    }
}
