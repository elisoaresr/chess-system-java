package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // Only classes within the same package and subclasses will be able to access a piece's board.
		return board;
	}
}
