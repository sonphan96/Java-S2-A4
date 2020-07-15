import java.util.Scanner;

/**
 * This is a program simulate playing cards
 * User can deal card, shuffle, print histogram
 */
public class Assignment4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Asking user for input
        System.out.println("How many ranks: ");
        int rank = scan.nextInt();

        System.out.println("How many suits: ");
        int suit = scan.nextInt();

        // Create new instance of DeckOfCards
        DeckOfCards deckOfCards = new DeckOfCards(rank,suit);
        Card a = new Card(1,2);


        String choice;
        int numToDeal;

        while(true){
            // Get the top card of the Deck
            Card firstCard = deckOfCards.getFirstCard();
            System.out.println("Deck of " + deckOfCards.getTotalNumberOfCard() +
                    ": low = 1, high = " + rank + " top = " );
            System.out.print(firstCard);

            System.out.println("Choose: 1=shuffle, 2=deal 1 hand, 3=deal 100000 times, 4=Quit:");
            choice = scan.nextLine();


            if(choice.equals("1")) // Shuffle the deck of card
            {
                deckOfCards.shuffle();
            }

            else if(choice.equals("2")) // deal card to user
            {
                System.out.println("How many card to deal: "); // the number cards to deal
                numToDeal = scan.nextInt();
                Card[] dealCards = deckOfCards.deal(numToDeal);
                System.out.println();
                System.out.print("Card: ");
                for(int i= 0; i <numToDeal; i++) // print the dealt cards
                {
                    System.out.print(dealCards[i] + " ");

                }
            }

            else if(choice.equals("3")) // deal card 100000 times and print histogram
            {
                System.out.println("How many card to deal: ");
                numToDeal = scan.nextInt();
                deckOfCards.histogram(numToDeal);
            }

            else {
                break;
            }

        }

    }
}
