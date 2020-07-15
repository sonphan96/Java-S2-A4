import java.util.Random;

/**
 * This Class use to create an array of cards
 * When create deck of cards can shuffle, get first card,
 * deal some cards and print histogram 100000 times
 * @author Truong Son Phan
 */
public class DeckOfCards {

    private int maxRank, numberOfSuits;
    Card[] cards = new Card[maxRank*numberOfSuits];

    /**
     * Create instance of DeckOfCards
     *
     * @param maxRank the highest rank in the deck of cards
     * @param numberOfSuits the total suits of deck of cards
     */

    public DeckOfCards(int maxRank, int numberOfSuits)
    {
        this.maxRank = maxRank;
        this.numberOfSuits = numberOfSuits;

        // Create each Card in a deck
        int i = 0;
        while(i < maxRank*numberOfSuits)
            for(int j =1 ; j < numberOfSuits + 1; j++){
                for(int k = 1; k < maxRank + 1; k++){

                    cards[i] = new Card(k,j);
                    i++;
                }
            }

    }




    /**
     * @return the total number of cards
     */
    public int getTotalNumberOfCard(){
        return maxRank*numberOfSuits;
    }

    /**
     * Get the top card of the deck
     * @return Card
     */
    public Card getFirstCard(){
        return cards[0];
    }

    /**
     * Randomly change 2 positions of Card 5 times
     */
    public void shuffle() {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            int index1 = r.nextInt(maxRank * numberOfSuits);
            int index2 = r.nextInt(maxRank * numberOfSuits);

            Card temp = cards[index1];
            cards[index1] = cards[index2];
            temp = cards[index2];
        }
    }

    /**
     * Deal the number of cards to user
     * @param numToDeal number of cards
     * @return an array of card
     */
    public Card[] deal(int numToDeal){
        Card[] dealCards = new Card[numToDeal];
        for(int i = 0; i < numToDeal; i++)
       {
          dealCards[i] = cards[i];
       }

        return dealCards;
    }

    /**
     * deal card 100000 times and print the histogram
     * @param numToDeal
     */
    public void histogram(int numToDeal){
        int[] histogram = new int[8];
        for(int i = 0; i <100000; i++) {
            int sum = 0;

            Card[] dealCards = deal(numToDeal);
            for(int j = 0; j <dealCards.length;j++){
                sum += dealCards[j].getValue();
                histogram[sum]++;
            }
            shuffle();

        }

    }


}
