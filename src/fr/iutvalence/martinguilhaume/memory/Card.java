package fr.iutvalence.martinguilhaume.memory;

/**
 * Memory cards.
 * 
 * @author Guilhaume Martin
 * @version TODO
 */
public class Card {
	/** Create the symbol A. */
	public final static char SYMBOL_A = 'A';
	/** Create the symbol B. */
	public final static char SYMBOL_B = 'B';

	/** Symbol on the card. */
	private final char symbol;
	/** Current status of the card. */
	private boolean hidden;

	/** Create a new card with the given symbol. */
	public Card(char symbol) {
		this.symbol = symbol;
		this.hidden = true;
	}

	/** Get the symbol of the card. */
	public char symbol(){
		return this.symbol;
	}

	/** Return the card. */
	public void flip() {
		if 
		else
			!this.hidden;
		// TODO retourner la carte.
	}

	@Override
	public String toString() {
		if(!this.hidden)
			return String.valueOf(this.symbol);
		else
			return "X";
	}
}






