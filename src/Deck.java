
/**
 * Poker Game
 * Class Deck only holding the 52 cards
 */

import java.util.Random;
import org.apache.commons.lang3.ArrayUtils;
 
public class Deck
{
    private Card[] Cards = new Card[52];
    private Card[] DisCards = new Card[52];

    public Deck()
    {
        int count = 0;
        for(int i = 1; i <= 13; i = i + 1){
            for(int j = 0; j < 4; j = j + 1){
                String suit;
                String number;
                switch (j){
                    case 0: suit = "s";
                        break;
                    case 1: suit = "h";
                        break;
                    case 2: suit = "c";
                        break;
                    case 3: suit = "d";
                        break;
                    default: suit = "x";
                        break;
                }
                switch (i){
                    case 1: number = "A";
                        break;
                    case 14: number = "A";
                        break;
                    case 10: number = "10";
                        break;
                    case 11: number = "J";
                        break;
                    case 12: number = "Q";
                        break;
                    case 13: number = "K";
                        break;
                    default: number = Integer.toString(i);
                        break;
                }
                Card c = new Card(suit, number);
                Cards[count] = c;
                count = count + 1;
            }
        }
    }

    public void printDeck(){
        for (int i = 0; i < Cards.length; i = i +1){
            Card temp = Cards[i];
            temp.print();
        }
    }
    
    public Card getCard(){
        Card tempCard = Cards[0];
        Cards = ArrayUtils.remove(Cards, 0);
        DisCards[51-Cards.length] = tempCard;
        return tempCard;
    }

    public void shuffleDeck(){
        Card[] tempCards = new Card[52];
        for (int i = 0; i < 52; i = i + 1){
            Random rand = new Random();
            int randomNum = rand.nextInt((Cards.length));
            tempCards[i] = Cards[randomNum];
            Cards = ArrayUtils.remove(Cards, randomNum);
        }
        Cards = tempCards.clone();
    }

}
