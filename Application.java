package finalproject;

public class Application {
    public static void main(String[] args) {
        // Instantiate a Deck and two Players, call the shuffle method on the deck
        Deck deck = new Deck();
        deck.shuffle();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Draw 52 cards and give half to each player
        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }


        // Flip cards and compare values to determine winner of each round
        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            System.out.println(player1.getName() + " flipped " + player1Card.describe());
            System.out.println(player2.getName() + " flipped " + player2Card.describe());

            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins the round!");
            } else if (player2Card.getValue() > player1Card.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins the round!");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println(player1.getName() + "'s score: " + player1.getScore());
            System.out.println(player2.getName() + "'s score: " + player2.getScore());
            System.out.println();
        }

        // Determine winner of the game and print final scores
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("The game ends in a tie!");
        }

        System.out.println(player1.getName() + "'s final score: " + player1.getScore());
        System.out.println(player2.getName() + "'s final score: " + player2.getScore());
    }
}



