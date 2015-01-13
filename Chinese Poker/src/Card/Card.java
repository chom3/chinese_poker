package Card;

/**
 * Creates a card object.
 * @author Corey Hom
 *
 */
public class Card
{
  private String suit;
  private int num;
  private String name;
  /**
   * Default constructor.
   */
  public Card()
  {
    suit = "Diamond";
    num = 3;
  }
  
  /**
   * Explicit constructor
   * @param suit
   * @param num
   */
  public Card(String name, String suit, int num)
  {
    this.name = name;
    this.suit = suit;
    this.num = num;
  }
  
/**
 * Accessors-------------------------------------------------------------
 */
  
  /**
   * Accessor for name.
   * @return name
   */
  
  public String getName()
  {
    return name;
  }
  /**
   * Accessor for suit.
   * @return suit
   */
  public String getSuit()
  {
    return suit;
  }
  /**
   * Accessor for number of card.
   * @return num
   */
  public int getNum()
  {
    return num;
  }
  
  /**
   * Rewrite toString
   */
  
  public String toString()
  {
	  return "Name: " + name + "\n" + "Suit: " + suit + "\n" + "Number: " + num;
  }
}
