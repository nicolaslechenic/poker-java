package PokerJava;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.*;

public class CardTest {
  @Test public void testFromString() {
    String stringCards = "5s-4s-Td-Kh-Ah";

    List<Card> cards = Card.fromString(stringCards);
    Character c1 = new Character(cards.get(1).getColor());
    Character c2 = new Character(cards.get(2).getValue());

    Character cc1 = new Character('s');
    Character cc2 = new Character('T');

    assert(c1.equals(cc1));
    assert(c2.equals(cc2));
  }

  @Test public void testFromLitteral() {
    String litteral = "5s";
    Card card = Card.fromLitteral(litteral);

    Character cv = new Character(card.getValue());
    Character cc = new Character(card.getColor());

    Character ccv = new Character('5');
    Character ccc = new Character('s');

    assert(cv.equals(ccv));
    assert(cc.equals(ccc));
  }
}