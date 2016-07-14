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
    
    private Card[] compCards = new Card[5];
    private Card[] myCards = new Card[5];
    private Deck gameDeck;
    private int compChips;
    private int myChips;
    
    
    public GameState(){
        gameDeck = new Deck();
        gameDeck.shuffleDeck();
        compChips = 25;
        myChips = 25;
    }
    
    public void newRound(){
        gameDeck = new Deck();
        gameDeck.shuffleDeck();
    }
    
    public Card[] getMyCards(){
        return myCards;
    }
    
    public Card[] getCompCards(){
        return compCards;
    }
    
    public void dealCards(){
        for (int i = 0; i < 5; i = i + 1){
            compCards[i] = gameDeck.getCard();
            myCards[i] = gameDeck.getCard();
        }
    }
    
    
}
