package deckofcard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class DeckOfCard {

    public static void main(String[] args) {

        // Initialize the deck of cards
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        List<String> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        // Shuffle the deck of cards
        Collections.shuffle(deck, new Random());

        // Distribute 9 cards to 4 players
        String[][] players = new String[4][9];
        int cardIndex = 0;
        for (int i = 0; i < players.length; i++) {
            for (int j = 0; j < players[i].length; j++) {
                players[i][j] = deck.get(cardIndex++);
            }
        }

        // Print the cards received by each player
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}
