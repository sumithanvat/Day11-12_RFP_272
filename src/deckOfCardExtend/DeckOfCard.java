package deckOfCardExtend;


import java.util.Random;

/*

Created class DeckOfCard

 */
public class DeckOfCard {


    // Initialize the deck of cards
    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final int NUM_CARDS = SUITS.length * RANKS.length;
    private static String[] deck = new String[NUM_CARDS];

    // Initialize the players
    private static final int NUM_PLAYERS = 4;
    private static Player[] players = new Player[NUM_PLAYERS];

    public static void main(String[] args) {

        // Initialize the deck of cards
        int cardIndex = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[cardIndex++] = rank + " of " + suit;
            }
        }

        // Shuffle the deck of cards
        shuffleDeck();

        // Initialize the players
        for (int i = 0; i < NUM_PLAYERS; i++) {
            players[i] = new Player("Player " + (i + 1));
            for (int j = 0; j < 9; j++) {
                players[i].addCard(deck[(i * 9) + j]);
            }
            players[i].sortCards();
        }

        // Print the cards received by each player
        for (Player player : players) {
            System.out.println(player.getName() + " cards:");
            player.printCards();
            System.out.println();
        }
    }

    private static void shuffleDeck() {
        Random rnd = new Random();
        for (int i = NUM_CARDS - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String temp = deck[index];
            deck[index] = deck[i];
            deck[i] = temp;
        }
    }
}
