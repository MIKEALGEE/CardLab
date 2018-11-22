import java.util.ArrayList;
import java.util.Collections;

public class Deck {

   private ArrayList<Card> cards;
   private ArrayList<Card> shuffledDeck;

    public Deck(){
        this.cards = new ArrayList<>();
        this.shuffledDeck = new ArrayList<>();
    }

    public int getSize(){
        return this.cards.size();
    }

    public int getSizeShuffledDeck(){
        return this.shuffledDeck.size();
    }

    public void addCardsToDeck(Card card){
        this.cards.add(card);
    }

    public void populateDeck(){
        Card card;
        for (SuitType suit : SuitType.values()){
            for (RankType rank : RankType.values()){
                card = new Card(suit, rank);
                this.cards.add(card);
            }
        }
    }

    public Card getOneCardFromDeck(){
        return this.shuffledDeck.remove(0);
    }

    public void shuffleDeck(){

        while (this.cards.size() > 0) {
            int index = (int) (Math.random()* this.cards.size());
            this.shuffledDeck.add(this.cards.remove(index));
        }

    }
        public void givePlayerCard(Player player1){
            Card card = this.getOneCardFromDeck();
            player1.addCard(card);

        }

//        Collections.shuffle(this.cards);

}
