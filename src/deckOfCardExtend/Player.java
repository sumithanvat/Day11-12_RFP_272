package deckOfCardExtend;
import org.w3c.dom.Node;

public class Player {

    private String name;
    private Node head;
    private Node tail;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addCard(String card) {
        Node node = new Node(card);
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public void sortCards() {
        if (head == null || head.next == null) {
            return;
        }

        Node current = head;
        while (current != null) {
            Node min = current;
            Node innerCurrent = current.next;
            while (innerCurrent != null) {
                if (compareCards(innerCurrent.card, min.card) < 0) {
                    min = innerCurrent;
                }
                innerCurrent = innerCurrent.next;
            }

            String temp = current.card;
            current.card = min.card;
            min.card = temp;

            current = current.next;
        }
    }

    public void printCards() {
        Node current = head;
        while (current != null) {
            System.out.println(current.card);
            current = current.next;
        }
    }

    private int compareCards(String card1, String card2) {
        String[] parts1 = card1.split(" ");
        String[] parts2 = card2.split(" ");
        String rank1 = parts1[0];
        String rank2 = parts2[0];
        int value1 = getValue(rank1);
        int value2 = getValue(rank2);
        return Integer.compare(value1, value2);
    }

    private int getValue(String rank) {
        switch (rank) {
            case "2":
                return 2;
            case "3":
                return 3;
            case "4":
                return 4;
            case "5":
                return 5;
            case "6":
                return 6;
            case "7":
                return 7;
            case "8":
                return 8;
            case "9":
                return 9;
            case "10":
            case "Jack":
            case "Queen":
            case "King":
                return 10;
            case "Ace":
                return 11;
            default:
                throw new IllegalArgumentException("Invalid rank: " + rank);
        }
    }
}