package application;

import boardgame.Board;

public class Program {

	public static void main(String[] args) {
		
		Board b = new Board(8,8);
		System.out.println(b.piece(1, 1));
	}

}
