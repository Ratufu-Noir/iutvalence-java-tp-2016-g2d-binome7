package fr.iutvalence.martinguilhaume.memory;

public class Board {
   
    private final Card cards[][] = new Card[2][2];

    //Dimension du plateu de jeu
    
    public Board(){
    	cards[0][0] = new Card('A');
    	cards[0][1] = new Card('B');
    	cards[1][0] = new Card('B');
    	cards[1][1] = new Card('A');

    }


}