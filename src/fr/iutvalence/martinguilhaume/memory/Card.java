package fr.iutvalence.martinguilhaume.memory;

public class Card {
	public final static char SYMBOLE_A = 'A';
	public final static char SYMBOLE_B = 'B';
	
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

	public void flip() {
		// TODO retourner la carte.
	}
	
	@Override
	public String toString() {
		 if(this.hidden == false)
	            return String.valueOf(this.symbol);
	        else
	            return "X";
		// TODO Avoir une représentation différente en fonction de "hidden"
		// En gros :
		// Si pas(hidden) alors retourner le symbole.
		// Si hidden alors afficher un symbole de masquage ("X", "[ ]"...)
	}
}






