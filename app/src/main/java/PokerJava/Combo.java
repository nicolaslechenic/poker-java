package PokerJava;

import java.util.*;

public class Combo {
  private List<Card> cards;

  Combo(List<Card> cards) {
    this.cards = cards;
  }

  public String best() {
    if(isFull()) {
     return "Full";
    } else if(isFlush()) {
      return "Flush";
    } else if(isPair()) {
      return "Pair";
    } else {
      return "Air";
    }
  }

  public boolean isFull() {
    return isThreeOfKind() && isPair();
  }
  
  public boolean isFlush() {
    for(int i = 0; i < cards.size() - 1; i++){
      Character c1 = cards.get(i).getColor();
      Character c2 = cards.get(i + 1).getColor();
      
      if(!c1.equals(c2)) {
        return false;
      }
    }

    return true;
  }

  public boolean isThreeOfKind() {
    for(int i = 0; i < cards.size(); i++){
      if(howMuch(cards.get(i)) == 3) {
        return true;
      }
    }

    return false;
  }

  public boolean isPair() {
    for(int i = 0; i < cards.size(); i++){
      if(howMuch(cards.get(i)) == 2) {
        return true;
      }
    }

    return false;
  }

  public boolean isAir() {
    return !isFlush() && !isAir();
  }

  private int howMuch(Card card) {
    int j = 0;

    for(int i = 0; i < cards.size(); i++){
      if(cards.get(i).getValue() == card.getValue()) {
        j++;
      }
    }

    return j;
  }
}