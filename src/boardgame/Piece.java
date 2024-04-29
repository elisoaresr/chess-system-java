package boardgame;

public abstract class Piece {

	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { // Only classes within the same package and subclasses will be able to access a piece's board.
		return board;
	}
	
	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
		//This method is calling a possible implementation of some class concrete of the Piece class.
	   //We have a method concrecte using an abstract method;
	  //It technique is call of hook methods;		
		
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves(); // This is the call of the abstract method. 
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
