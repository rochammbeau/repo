package game.objects;

import java.util.Collections;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Deck {

	private ArrayList<Card> cards;

	public Deck() {

		this.cards = new ArrayList<Card>(52);

		for (Flower flower : Flower.values()) {

			Color color = Color.BLACK;

			if (flower.equals(Flower.HEART) || flower.equals(Flower.DIAMOND)) {

				color = Color.RED;

			}

			for (CardValue cardValue : CardValue.values()) {

				Card card = new Card(flower, color, cardValue);
				this.cards.add(card);
			
			
			}}
			
			
			
			
			
			
			

		

	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public static void main(String args[]) {

		Deck deck = new Deck();
		int i = 1;

		for (Card card : deck.getCards()) {

			System.out.println(card.getColor() + " : " + card.getCardValue() + " : " + card.getFlower() + " #" + i);
			i++;

		}
		System.out.println("--------------------------------------------------");

		deck.shuffle();
		int l = 1;
		for (Card card : deck.getCards()) {
			System.out.println(card.getColor() + " : " + card.getCardValue() + " : " + card.getFlower() + " #" + l);
			l++;

		}
		System.out.println("--------------------------------------------------");

		deck.shuffle();
		l = 1;
		for (Card card : deck.getCards()) {
			System.out.println(card.getColor() + " : " + card.getCardValue() + " : " + card.getFlower() + " #" + l);
			l++;
		}
		
		System.out.println("--------------------------------------------------");

		deck.shuffle();
		l = 1;
		for (Card card : deck.getCards()) {
			System.out.println(card.getColor() + " : " + card.getCardValue() + " : " + card.getFlower() + " #" + l);
			l++;
			
		}
	

	}

	public void shuffle() {
		Random rand = new Random();

		ArrayList<Card> cardList = new ArrayList<Card>(this.cards);
		this.cards.clear();

		while (!cardList.isEmpty()) {
			int slot = rand.nextInt(cardList.size());

			Card myCard = cardList.get(slot);
			cardList.remove(slot);
			this.cards.add(myCard);

		}

	}

	public Card takeCard(){
		
		
		Card topCard = this.cards.get(0);
		this.cards.remove(0);
		return topCard;
		
		
		
		
	}
	
	public boolean isEmpty(){
		
		boolean f;
		f = (cards.size() == 0 );
		return f;
		
		
		
		
	}
	
}
