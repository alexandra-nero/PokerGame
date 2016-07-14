
import java.awt.Color;


/**
 * Poker Game, Lowest Class, Card
 * details the suit and value of the card
 */
public class Card
{
    private String suit;
    private String number;
    
    public Card(String suit, String number)
    {
        this.suit = suit;
        this.number = number;
    }
    
    public String getSuit(){
        return suit;
    }
    
    public String getNumber(){
        return number;
    }
    
    public String getSuitCode(){
        switch(this.suit){
            case "s": return "\u2660";
            case "h": return "\u2666";
            case "c": return "\u2663";
            case "d": return "\u2764";
            default: return " ";
        }
    }
    
    public int getSuitValue(){
        switch(this.suit){
            case "s": return 4;
            case "h": return 3;
            case "c": return 2;
            case"d": return 1;
            default: return 0;
        }
    }
    
    public Color getColor(){
        Color black = new Color(0, 0, 0);
        Color red = new Color(255, 0, 0);
        switch(this.suit){
            case "s": return black;
            case "h": return red;
            case "c": return black;
            case"d": return red;
            default: return black;
        }
    }
    
    public int getNumberValue(){
        String num = this.number;
        switch(num){
            case "A": return 14;
            case "K": return 13;
            case "Q": return 12;
            case "J": return 11;
            default: return Integer.parseInt(num);
        }
    }
    
    public void print(){
        System.out.println(suit + " " + number);
    }
}
