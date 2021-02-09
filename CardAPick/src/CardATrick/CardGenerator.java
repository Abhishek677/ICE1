package CardATrick;

import CardATrick.Card.Suit;
import CardATrick.Card.Value;
import java.util.*;


public class CardGenerator
{
  public static Card[] generateCards(int numCards,Suit[] cardSuits,Value[] cardValues)
    {
      Random random = new Random();
      
       Card[] magicHand = new Card[numCards];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Suit suit = cardSuits[random.nextInt(cardSuits.length)];
            Value value = cardValues[random.nextInt(cardValues.length)];
            
            Card c = new Card(suit,value);
            magicHand[i] = c;
            
        }
        return magicHand;

        
    }
    
    }
