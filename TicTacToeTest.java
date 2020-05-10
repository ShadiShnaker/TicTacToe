package testStack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicTacToeTest {
	
	@Test
	public void testHasWon() {
		boolean flag = true;
		TicTacToe game = new TicTacToe();
		/***
		 * test backward diagonal
		 */
		game.initGame();
		game.board[0][0] = 1;
		game.board[1][1] = 1;
		game.board[2][2] = 1;
		flag = flag && game.hasWon(1, 2, 2);
		
		/***
		 * test forward diagonal
		 */
		game.initGame();
		game.board[0][2] = 1;
		game.board[1][1] = 1;
		game.board[2][0] = 1;
		flag = flag && game.hasWon(1, 2, 2);
		
		/***
		 * test 3 in row
		 */
		game.initGame();
		game.board[0][0] = 1;
		game.board[0][1] = 1;
		game.board[0][2] = 1;
		flag =flag && game.hasWon(1, 0, 2);
		
		/***
		 * test 3 in column
		 */
		game.initGame();
		game.board[0][0] = 1;
		game.board[1][0] = 1;
		game.board[2][0] = 1;
		flag = flag && game.hasWon(1, 2, 0);
		
		if(!flag)
			fail("fail with hasWon function!");
	}

	@Test
	public void testValidate3inDiagonal() {
		boolean flag = true;
		TicTacToe game = new TicTacToe();
		
		/***
		 * test backward diagonal
		 */
		game.initGame();
		game.board[0][0] = 1;
		game.board[1][1] = 1;
		game.board[2][2] = 1;
		flag = flag && game.validate3inDiagonal(1, 1, 1);
		
		/***
		 * test forward diagonal
		 */
		//forward diagonal
		game.initGame();
		game.board[0][2] = 1;
		game.board[1][1] = 1;
		game.board[2][0] = 1;
		flag = flag && game.validate3inDiagonal(1, 1, 1);
		if(!flag)
			fail("fail in validate3inDiagonal function!");
	}

	@Test
	public void testBackwardDiagonal() {
		boolean flag = true;
		TicTacToe game = new TicTacToe();
		/***
		 * test backward diagonal
		 */
		game.initGame();
		game.board[0][0] = 1;
		game.board[1][1] = 1;
		game.board[2][2] = 1;
		flag = flag && game.backwardDiagonal(1, 1, 1);
		if(!flag)
			fail("fail in backwardDiagonal function!");
	}

	@Test
	public void testForwardDiagonal() {
		boolean flag = true;
		TicTacToe game = new TicTacToe();
		/***
		 * test forward diagonal
		 */
		game.initGame();
		game.board[0][2] = 1;
		game.board[1][1] = 1;
		game.board[2][0] = 1;
		flag = flag && game.forwardDiagonal(1, 1, 1);
		if(!flag)
			fail("fail in forwardDiagonal function!");
	}

	@Test
	public void testValidate3inColumn() {
		TicTacToe game = new TicTacToe();
		boolean flag = true;
		/***
		 * test validate 3 in column
		 */
		game.initGame();
		game.board[0][0]=1;
		game.board[1][0]=1;
		game.board[2][0]=1;
		flag = flag && game.validate3inColumn(0, 1);
		if(!flag)
			fail("error with validate3inColumn!");
	}

}
