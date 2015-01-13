package game;

import java.util.ArrayList;
import java.util.Random;
import Card.Card;
import java.util.Collections;
import java.util.Scanner;

public class Game
{
	
  public static void main(String[] args)
  {
    ArrayList<Card> deck = Deck.Deck.getDeck();
    //shuffle the deck
    Collections.shuffle(deck);
//    for(Card p : deck)
//    {
//    	System.out.println(p.toString());
//    }
    //beginning the game 
    int counter = 0;
    Boolean game_loop = true;
    String game_type;
    System.out.println("Chinese Poker!");
    Scanner user_input = new Scanner(System.in);
    System.out.println("(1) 1v1 or (2) 4 player game? or (3) quit?");
    while (game_loop)
    {
	    game_type = user_input.next();
	    //System.out.println(game_type);
	    if (game_type.equals("1"))
	    {
	    	System.out.println("1v1");
	    }
	    else if (game_type.equals("2"))
	    {
	    	System.out.println("4 player game.");
	    }
	    else if (game_type.equals("3"))
	    {
	    	System.exit(0);
	    }
	    else
	    {
	    	System.out.println("Not an option.");
	    }
    }
  }
  
}
