/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexandra
 */
public class GameState {
    
    private Hand compHand;
    private Hand myHand;
    private Deck gameDeck;
    private int compChips;
    private int myChips;
    private int Pot;
    
    //states: 0 is nothing, waiting
    //1 is betting 
    //2 is calling
    //3 is folded
    private int compState;
    private int myState;
    
    
    public GameState(){
        gameDeck = new Deck();
        gameDeck.shuffleDeck();
        compChips = 50;
        myChips = 50;
        compState = 0;
        myState = 0;
    }
    
    public void newRound(){
        gameDeck = new Deck();
        gameDeck.shuffleDeck();
        compState = 0;
        myState = 0;
    }
    
    public Card[] getMyCards(){
        return myHand.getCards();
    }
    
    public void anteUp(){
        Pot += 10;
        myChips -= 5;
        compChips -= 5;
    }
    
    public int getCompChips(){
        return compChips;
    }
    
    public int getMyChips(){
        return myChips;
    }
    
    public Card[] getCompCards(){
        return compHand.getCards();
    }
    
    public int getCompState(){
        return compState;
    }
    
    public void setCompState(int state){
        this.compState = state;
    }
    
    public int getMyState(){
        return myState;
    }
    
    public void setMyState(int state){
        this.myState = state;
    }
    
    public void dealCards(){
        Card[] compCards = new Card[5];
        Card[] myCards = new Card[5];
        for (int i = 0; i < 5; i = i + 1){
            compCards[i] = gameDeck.getCard();
            myCards[i] = gameDeck.getCard();
        }
        compHand = new Hand(compCards);
        myHand = new Hand(myCards);
        compHand.order();
        myHand.order();
    }
    
    
    
}
