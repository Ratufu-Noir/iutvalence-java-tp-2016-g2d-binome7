package fr.iutvalence.martinguilhaume.memory;

import java.util.Objects;

/**
 * Memory game.
 *
 * @author Guilhaume Martin
 * @version TODO
 */
public class Game {
    /** TODO. */
    private final Board board;

    /** TODO. */
    public Game() {
        this.board = new Board();
    }

    /** TODO. */
    public void run() {
        boolean victory = false;

        while (!victory) {
            // TODO Demander les coordonn�es de la carte 1;
            int x1 = 0;
            int y1 = 0;

            // TODO Retourner la carte 1

            // TODO Demander les coordonn�es de la carte 2
            int x2 = 1;
            int y2 = 1;

            // TODO Retourner la carte 2

            // TODO V�rifier et agir en cons�quence

            // TODO V�rifier victoire

        }
    }

    public boolean checkCards(Card card1, Card card2) {
        return Objects.equals(card1.symbol(), card2.symbol());
    }

    // TODO Move in board
    public boolean isGameWon() {
        for (Card c : this.cards) {
            if (c.checkCards() == false) {
                return false;
            }
        }
        return true;
    }
}
