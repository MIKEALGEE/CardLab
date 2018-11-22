import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Card card;
    Deck deck;
    Player player1;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.ACE);
        player1 = new Player();
    }

    @Test
    public void checkIfDeckIsEmpty(){
        assertEquals(0, deck.getSize());
    }

    @Test
    public void canAddCardToDeck(){
        deck.addCardsToDeck(card);
        assertEquals(1, deck.getSize());
    }

    @Test
    public void canAddAllCardToDeck(){
        deck.populateDeck();
        assertEquals(52, deck.getSize());
    }

//    @Test
//    public void canGetFirstCard(){
//        deck.populateDeck();
//        deck.shuffleDeck();
//        Card card = deck.getOneCardFromDeck();
//        Card cardTest = new Card(SuitType.HEARTS, RankType.ACE);
//        assertEquals(cardTest.getSuit(), card.getSuit());
//        assertEquals(cardTest.getCardValue(), card.getCardValue());
//    }

    @Test
    public void checkShuffledDeck(){
        deck.populateDeck();
        deck.shuffleDeck();
//        assertEquals(52, deck.getSize());
        assertEquals(52, deck.getSizeShuffledDeck());

    }

    @Test
    public void checkPlayerHand(){
        deck.populateDeck();
        deck.shuffleDeck();
        deck.givePlayerCard(player1);
    assertEquals(1,player1.handSize());
    }


}
