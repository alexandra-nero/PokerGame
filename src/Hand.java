
/**
*/
public class Hand
{
    private Card[] cards = new Card[5];
    private Card[] winCards;
    private int rank;
    
    
    public Hand(Card c1, Card c2, Card c3, Card c4, Card c5)
    {
       cards[0] = c1;
       cards[1] = c2;
       cards[2] = c3;
       cards[3] = c4;
       cards[4] = c5;
    }

    public Hand(Card[] cards)
    {
        if (cards.length == 5){
            this.cards = cards;
        }
    }
    
    public Card[] getCards(){
        return cards;
    }

    public boolean isOrdered(){
      for (int i = 0; i <5; i = i + 1){
        int suit1 = cards[i].getSuitValue();
        int number1 = cards[i].getNumberValue();
        for (int j = i + 1; j < 5; j = j + 1){
            int suit2 = cards[j].getSuitValue();
            int number2 = cards[j].getNumberValue();
              if (number1 > number2){
                return false;
              }
              else if (number1 == number2){
                if(suit1 > suit2){
                  return false;
                }
              }
          }
      }
      return true;
    }

    public void order(){
        for (int i = 0; i < 5; i = i + 1){
            for (int j = i + 1; j < 5; j = j + 1){
                int suit1 = cards[i].getSuitValue();
                int number1 = cards[i].getNumberValue();
                int suit2 = cards[j].getSuitValue();
                int number2 = cards[j].getNumberValue();
                if (number1 > number2){
                    Card tempCard = cards[i];
                    cards[i] = cards[j];
                    cards[j] = tempCard;
                }
                else if (number1 == number2){
                    if(suit1 > suit2){
                       Card tempCard = cards[i];
                       cards[i] = cards[j];
                       cards[j] = tempCard;
                    }
                }
            }
        }
    }
    
    public Card highCard(boolean storeCards){
        if (storeCards){
            winCards = new Card[] {cards[4]};
        }
        return cards[4];
    }

    public boolean hasOnePair(boolean storeCards){
        if (this.hasTwoPair(false)||this.hasThreeOfAKind(false)
                ||this.hasFourOfAKind(false)||this.hasFullHouse(false)){
          return false;
        }
        for (int i = 0; i < 4; i = i + 1){
          String number1 = cards[i].getNumber();
          String number2 = cards[i+1].getNumber();
          if (number1.equals(number2)){
              if (storeCards){
                winCards = new Card[] {cards[i], cards[i+1]};
              }
              return true;
          }
        }
        return false;
    }

    public boolean hasThreeOfAKind(boolean storeCards){
      if(this.hasFourOfAKind(false) || this.hasFullHouse(false)){
        return false;
      }
      String number1 = cards[0].getNumber();
      String number2 = cards[1].getNumber();
      String number3 = cards[2].getNumber();
      String number4 = cards[3].getNumber();
      String number5 = cards[4].getNumber();
      if (number1.equals(number2) && number2.equals(number3)){
          if(storeCards){
            winCards = new Card[] {cards[0], cards[1], cards[2]};
          }
          return true;
      }
      else if (number2.equals(number3) && number3.equals(number4)){
          if(storeCards){
            winCards = new Card[] {cards[1], cards[2], cards[3]};            
          }
          return true;
      }
      else if (number3.equals(number4) && number4.equals(number5)){
          if(storeCards){
            winCards = new Card[] {cards[2], cards[3], cards[4]};           
          }
          return true;
      }
      else{
          return false;
      }
    }

    public boolean hasFourOfAKind(boolean storeCards){
      String number1 = cards[0].getNumber();
      String number2 = cards[1].getNumber();
      String number3 = cards[2].getNumber();
      String number4 = cards[3].getNumber();
      String number5 = cards[4].getNumber();
      if (number1.equals(number2) && number2.equals(number3) && number3.equals(number4)){
          if(storeCards){
             winCards = new Card[] {cards[0], cards[1], cards[2], cards[3]};   
          }
          return true;
      }
      else if (number2.equals(number3) && number3.equals(number4)&& number4.equals(number5)){
          if(storeCards){
             winCards = new Card[] {cards[1], cards[2], cards[3], cards[4]};   
          }
          return true;
      }
      else {
        return false;
      }
    }

    public boolean hasStraight(boolean storeCards){
      String number4 = cards[4].getNumber();
      int number = 0;
      number = cards[0].getNumberValue();
        for(int i = 1; i < 5; i = i + 1){
            if (i == 4 && number4.equals("A")){
              if(storeCards){
                winCards = new Card[] {cards[0], cards[1], cards[2], cards[3], cards[4]};   
              }
              return true;
            }
            else if (cards[i].getNumberValue() != (number + i)){
              cards[i].print();
                return false;
            }
        }
        if(storeCards){
             winCards = new Card[] {cards[0], cards[1], cards[2], cards[3], cards[4]};   
        }
        return true;
    }

    public boolean hasTwoPair(boolean storeCards){
      if (this.hasFourOfAKind(false) || this.hasFullHouse(false)){
        return false;
      }
      String number1 = cards[0].getNumber();
      String number2 = cards[1].getNumber();
      String number3 = cards[2].getNumber();
      String number4 = cards[3].getNumber();
      String number5 = cards[4].getNumber();
      if (number1.equals(number2) && number3.equals(number4)){
          if(storeCards){
             winCards = new Card[] {cards[0], cards[1], cards[2], cards[3]};   
          }
          return true;
      }
      else if (number2.equals(number3) && number4.equals(number5)){
          if(storeCards){
             winCards = new Card[] {cards[1], cards[2], cards[3], cards[4]};   
          }
          return true;
      }
      else if (number1.equals(number2) && number4.equals(number5)){
          if(storeCards){
             winCards = new Card[] {cards[0], cards[1], cards[3], cards[4]};   
          }
          return true;
      }
      else{
          return false;
      }
    }

    public boolean hasFlush(boolean storeCards){
        String suit1 = cards[0].getSuit();
        for (int i = 1; i < 5; i = i + 1){
            String suit2 = cards[i].getSuit();
            if (!(suit1.equals(suit2))){
                if(storeCards){
                    winCards = new Card[] {cards[0], cards[1], cards[2], cards[3], cards[4]};   
                }
                return false;
            }
        }
        return true;
    }

    public boolean hasFullHouse(boolean storeCards){
      String number1 = cards[0].getNumber();
      String number2 = cards[1].getNumber();
      String number3 = cards[2].getNumber();
      String number4 = cards[3].getNumber();
      String number5 = cards[4].getNumber();
      if (number1.equals(number2) && number3.equals(number4) && number4.equals(number5)){
          if(storeCards){
                winCards = new Card[] {cards[0], cards[1], cards[2], cards[3], cards[4]};   
          }
          return true;
      }
      else if (number1.equals(number2) && number2.equals(number3)&& number4.equals(number5)){
          if(storeCards){
                winCards = new Card[] {cards[0], cards[1], cards[2], cards[3], cards[4]};   
          }
          return true;
      }
      else {
        return false;
      }
    }

    public boolean hasStraightFlush(boolean storeCards){
      if(this.hasStraight(false) && this.hasFlush(false)){
        return true;
      }
      else{
        return false;
      }
    }

    public boolean hasRoyalFlush(boolean storeCards){
      if (this.hasStraightFlush(false) && cards[0].getNumber().equals("10")){
          if(storeCards){
                winCards = new Card[] {cards[0], cards[1], cards[2], cards[3], cards[4]};   
           }
        return true;
      }
      return false;
    }

    public void printHand(){
        for (int i = 0; i < 5; i = i + 1){
            System.out.println("card: " + cards[i].getSuit()+ cards[i].getNumber());
        }
    }
}
