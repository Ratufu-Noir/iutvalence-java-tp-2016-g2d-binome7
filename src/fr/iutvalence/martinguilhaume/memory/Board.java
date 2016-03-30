package fr.iutvalence.martinguilhaume.memory;

/**
 * Memory board.
 * 
 * @author Guilhaume Martin
 * @version TODO
 */
public class Board {
	/** Size of the board. */
    private final Card cards[][] = new Card[2][2];

    /** Position of cards in the board. */
    public Board(){
    	cards[0][0] = new Card('A');
    	cards[0][1] = new Card('B');
    	cards[1][0] = new Card('B');
    	cards[1][1] = new Card('A');
    }
   
    public Card flip(int x, int y) {
    	// TODO
    }
}