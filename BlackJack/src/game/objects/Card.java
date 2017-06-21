package game.objects;

public class Card {

	private Flower flower;
	private Color color;
	private CardValue cardValue;
	
	public Flower getFlower() {
		return flower;
	}
	public void setFlower(Flower flower) {
		this.flower = flower;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public CardValue getCardValue() {
		return cardValue;
	}
	public void setCardValue(CardValue cardValue) {
		this.cardValue = cardValue;
	}
	
	
	public Card(Flower flower, Color color, CardValue cardValue){
		
		this.flower = flower;
		this.color = color;
		this.cardValue = cardValue;
		
		
	}
	
	public static void main(String args[]){
		
		Card a = new Card(Flower.CLUB, Color.BLACK, CardValue.ACE);
		
		System.out.println(a.getCardValue());
		System.out.println(a.getColor());
		System.out.println(a.getFlower());
		
		
		
	}
	@Override
	public String toString() {
		return "Card [flower=" + flower + ", color=" + color + ", cardValue=" + cardValue + "]";
	}
	
	
}
