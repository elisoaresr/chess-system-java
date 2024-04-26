package boardgame;

public class Position {

	private int row;
	private int column;

	public Position() {

	}

	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	@Override
	public String toString() { // The object class is a superclass of all classes. Therefore, we are overwriting the toString that is from the Object class.
		StringBuilder sb = new StringBuilder();
		sb.append(row + ", " + column);
		return sb.toString();
	}

}
