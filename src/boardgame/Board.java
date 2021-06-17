package boardgame;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Board {
	
	@Getter
	@Setter
	private int rows;
	@Getter
	@Setter	
	private int columns;
	private Piece[][] pieces;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}
	
}
