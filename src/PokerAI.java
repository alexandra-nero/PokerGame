
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandra
 */
public class PokerAI {
    private int bluff;
    
    public PokerAI(){
        Random rand = new Random();
        bluff = rand.nextInt(10);
    }
    
    public Card[] highCardDiscard(Hand currHand){
        Card[] disCards = currHand.getCards();
        if (bluff < 6){
            return new Card[]{disCards[0], disCards[1], disCards[2]};
        }
        else if (bluff < 9){
            return new Card[]{disCards[0], disCards[1]};
        }
        else{
            return new Card[]{disCards[1]};
        }
    }
    
    public Card[] onePairDiscard(Hand currHand){
        Card[] disCards = currHand.getCards();
        if (bluff )
    }
    
    
    public Card[] chooseDiscard(Hand currHand){
        switch(currHand.getRank()){
            case 0:
                return highCardDiscard(currHand);
            case 1:
                return onePairDiscard(currHand);
        }
    }
    
    
}
