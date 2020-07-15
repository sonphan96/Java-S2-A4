
/**
 * This class use to create a card with 2 values: rank and suit
 * User can get and set the rank, suit of that card
 *
 * @author Truong Son Phan
 */
public class Card {

    private int rank, suit;

    /**
     * Constructor to create instance of card
     *
     * @param rank of the card
     * @param suit of the card
     */
    public Card(int rank,int suit)
    {
        this.rank = rank;
        this.suit = suit;
    }


    /**
     * Calculate the value of the card
     * @return value
     */
    public int getValue(){
        return rank*suit;
    }

    /**
     * toString method print the rank and suit of the card
     * @return
     */
    @Override
    public String toString(){
        return "Card R" + rank + " S" + suit;
    }

}

