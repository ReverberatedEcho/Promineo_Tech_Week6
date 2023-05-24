package finalproject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (int i = 2; i <= 14; i++) {
            cards.add(new Card(i, "Spades"));
            cards.add(new Card(i, "Hearts"));
            cards.add(new Card(i, "Diamonds"));
            cards.add(new Card(i, "Clubs"));
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }
}



