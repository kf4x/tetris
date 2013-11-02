package edu.cs251.chavezl3;
/**
 * Class contains information about the L block
 * @author Javier Chavez
 * @assignment Lab3  Part 1 - Tetris Blocks
 *
 */
public class EyeShape extends TetrisPiece2D {

	public EyeShape(Block b) {
		
		piece = new Block[][]{
				{b,	b,	b,	b}
			};
		
		dimension = new Dimension2D(piece.length, piece[0].length);
	}

}