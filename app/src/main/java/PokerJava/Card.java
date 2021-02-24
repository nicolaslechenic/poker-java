package PokerJava;

import java.util.*;

public class Card {


  public static List<Card> fromString(String cards) {
    List<Card> aryCards = new ArrayList<Card>();
    String[] litterals = cards.split("-");

    for(int i = 0; i < litterals.length; i++){
      Card card = fromLitteral(litterals[i]);
      aryCards.add(card);
    }

    return aryCards;
  }

  
  public static Card fromLitteral(String litteral) {
    return new Card(litteral.charAt(0), litteral.charAt(1));
  }


  private char value;
  private char color;

  Card(char value, char color) {
    this.value = value;
    this.color = color;
  }

  public char getColor() {
    return this.color;
  }

  public char getValue() {
    return this.value;
  }
}