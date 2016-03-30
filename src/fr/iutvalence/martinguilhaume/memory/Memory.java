package fr.iutvalence.martinguilhaume.memory;

/**
 * Start memory game.
 * 
 * @author Guilhaume Martin
 * @version TODO
 */
public class Memory {

	/**
	 * TODO.
	 * 
	 * @param args TODO
	 */
	public static void main(String[] args) {
		Game game = new Game();
		game.run();
		Player player = new Player(0);
		System.out.println ();
	}

}
