import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

Card card;

    @Before
public void before(){
        card = new Card(SuitType.SPADES,RankType.ACE );
    }

    @Test
    public void canGetSuit(){
assertEquals(SuitType.SPADES, card.getSuit());
    }

    @Test
    public void canGetvalueOfCard(){
        assertEquals(1, card.getCardValue());
    }
}
