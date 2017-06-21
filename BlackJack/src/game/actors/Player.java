package game.actors;

import java.util.ArrayList;
import java.util.HashMap;

import game.objects.Card;
import game.objects.Chips;

public class Player extends Human {

	private ArrayList<Card> cards = new ArrayList<Card>();

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public Player(String firstName, String lastName) {

		super(firstName, lastName);

	}

	public static void main(String args[]) {

		Player p = new Player("John", "Smith");
		System.out.println(p.getFirstName() + " " + p.getLastName());
		p.setLastName("Parsacala");
		System.out.println(p.getFirstName() + " " + p.getLastName());

		Player p2 = new Player("John", "Smith");
		p2.setFirstName("Michael");
		System.out.println(p2.getFirstName() + " " + p2.getLastName());

		System.out.println("lAyer2 " + p2);

	}

	public void recieveCard(Card card) {

		this.cards.add(card);

	}

	public int totalValue() {
		int temporary = 0;
		for (int f = 0; f <= cards.size() - 1; f++) {

			temporary = temporary + cards.get(f).getCardValue().getValue();

		}
		return temporary;

	}

	private int win = 0;

	public int getWin() {
		return win;
	}

	public void setWin(int win) {
		this.win = win;
	}

	public int incrementWin() {

		this.win++;
		return this.win;

	}
	
HashMap<Chips, Integer> chipCount = new HashMap<Chips, Integer>();

	

}