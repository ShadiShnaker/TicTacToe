package testStack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicTacToeTest {
	
	@Test
	public void testHasWon() {
		assertTrue(TicTacToe.hasWon(0, 1, 1));
	}


	@Test
	public void testValidate3inDiagonal() {
		assertTrue(TicTacToe.validate3inDiagonal(1, 1, 0));
	}

	@Test
	public void testBackwardDiagonal() {
		assertTrue(TicTacToe.backwardDiagonal(1, 1, 0));
	}

	@Test
	public void testForwardDiagonal() {
		assertTrue(TicTacToe.forwardDiagonal(1, 1, 0));
	}

	@Test
	public void testValidate3inColumn() {
		assertTrue(TicTacToe.validate3inColumn(1, 0));
	}

}
