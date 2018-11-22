import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;

    public Player() {

        this.hand = new ArrayList<>();
    }

    public int handSize(){
        return this.hand.size();
    }

    public void addCard(Card card){
    this.hand.add(card);
    }
}
