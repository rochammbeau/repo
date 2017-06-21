package game.actors;

import java.util.ArrayList;

import game.objects.Card;
import game.objects.Deck;

public class Dealer extends Player {

	// added Deck
	private Deck deck;

	public Deck getDeck() {
		return deck;
	}

	private ArrayList<Card> cards = new ArrayList<Card>();

	public void setDeck(Deck deck) {
		this.deck = deck;
	}

	public Dealer(String firstName, String lastName) {

		super(firstName, lastName);

	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public static void main(String args[]) {

		Dealer d = new Dealer("Jane", "Doe");
		Dealer d2 = new Dealer("Alex", "Grace");

		d.setFirstName(d2.getFirstName());

		System.out.println(d);
		System.out.println(d2);

	}

	public void shuffle() {

		if (this.deck == null || this.deck.isEmpty()) {

			this.deck = new Deck();

		}

		this.deck.shuffle();

	}

	public void dealCard(Player player) {

		if (deck.isEmpty()) {

			this.shuffle();

		}

		Card card = this.deck.takeCard();

		player.recieveCard(card);

	}
}
