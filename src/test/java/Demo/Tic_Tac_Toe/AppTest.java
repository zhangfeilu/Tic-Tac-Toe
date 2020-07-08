package Demo.Tic_Tac_Toe;

import Demo.Tic_Tac_Toe.ChessBoard;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testHasWinMethod()
    {
    	String[][] board = new String[][]{{" ","O"," "},{" ","O"," "},{"X","O","X"}};
    	ChessBoard b = new ChessBoard();
    	b.setBoard(board);
        assertTrue(b.hasWinner());
        
    	board = new String[][]{{" ","O"," "},{" ","O"," "},{"X","X","X"}};
    	b.setBoard(board);
        assertTrue(b.hasWinner());
        
        
    	board = new String[][]{{"O"," ","O"},{" ","O","X"},{" ","X","X"}};
    	b.setBoard(board);
        assertTrue(!b.hasWinner());
    }
    
    public void testIfFullMethod()
    {
    	String[][] board = new String[][]{{" ","O"," "},{" ","O"," "},{"X","O","X"}};
    	ChessBoard b = new ChessBoard();
    	b.setBoard(board);
        assertTrue(!b.boardIsFull());
        
    	board = new String[][]{{"X","O","X"},{"O","O","O"},{"X","X","X"}};
    	b.setBoard(board);
        assertTrue(b.boardIsFull());
    }
}
