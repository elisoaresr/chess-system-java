package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	public Rook(Board board, Color color) { // This constructor will simply forward the call to the superclass.
		super(board, color);
	}

	@Override
	public String toString() {
		return "R";
	}

}
