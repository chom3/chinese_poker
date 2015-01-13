package Deck;

import java.util.ArrayList;
import java.util.Arrays;

import Card.*;

/**
 * Creates the card deck arraylist.
 * @author Corey Hom
 *
 */
public class Deck
{
  
  private static ArrayList<Card> deck = new ArrayList<Card>(Arrays.asList(
      Cardlist.getC1(), Cardlist.getC2(), Cardlist.getC3(), Cardlist.getC4(), 
      Cardlist.getC4(), Cardlist.getC5(), Cardlist.getC6(), Cardlist.getC7(), 
      Cardlist.getC8(), Cardlist.getC9(), Cardlist.getC10(), Cardlist.getC11(), 
      Cardlist.getC12(), Cardlist.getC13(),
      Cardlist.getD1(), Cardlist.getD2(), Cardlist.getD3(), Cardlist.getD4(), 
      Cardlist.getD4(), Cardlist.getD5(), Cardlist.getD6(), Cardlist.getD7(), 
      Cardlist.getD8(), Cardlist.getD9(), Cardlist.getD10(), Cardlist.getD11(), 
      Cardlist.getD12(), Cardlist.getD13(), 
      Cardlist.getH1(), Cardlist.getH2(), Cardlist.getH3(), Cardlist.getH4(), 
      Cardlist.getH4(), Cardlist.getH5(), Cardlist.getH6(), Cardlist.getH7(), 
      Cardlist.getH8(), Cardlist.getH9(), Cardlist.getH10(), Cardlist.getH11(), 
      Cardlist.getH12(), Cardlist.getH13(), 
      Cardlist.getS1(), Cardlist.getS2(), Cardlist.getS3(), Cardlist.getS4(), 
      Cardlist.getS4(), Cardlist.getS5(), Cardlist.getS6(), Cardlist.getS7(), 
      Cardlist.getS8(), Cardlist.getS9(), Cardlist.getS10(), Cardlist.getS11(), 
      Cardlist.getS12(), Cardlist.getS13()));
  
  /**
   * Getter for deck.
   * @return deck
   */
  public static ArrayList<Card> getDeck()
  {
    return deck;
  }

}
