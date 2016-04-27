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
        while (!board.isGameWon()) {
            // TODO Demander les coordonn�es de la carte 1;
            int x1 = 0;
            int y1 = 0;

            char c1 = board.flip(x1, y1);


            // TODO Demander les coordonn�es de la carte 2;
            int x2 = 1;
            int y2 = 1;
            
            char c2 = board.flip(x2, y2);
           
            System.out.println(board);

            // TODO V�rifier et agir en cons�quence
            checkCards(c1,c2);
            if (c1 == c2);
        }
        
        System.out.println("You win!");
    }

    public boolean checkCards(char card1, char card2) {
        return card1 == card2;
    }
    
    
}
