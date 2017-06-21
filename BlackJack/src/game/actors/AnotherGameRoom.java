package game.actors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import game.objects.Card;

public class AnotherGameRoom {

	private Dealer dealer;
	ArrayList<Player> players = new ArrayList<Player>();

	public AnotherGameRoom(Dealer dealer, ArrayList<Player> players) {

		this.dealer = dealer;
		this.players = players;

	}

	public static void main(String args[]) {

		Dealer dealer = new Dealer("Joe", "Smith");
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<Player> sortTablePlayer = new ArrayList<Player>();
		Player p1 = new Player("Jane", "Doe");
		Player p2 = new Player("Steve", "Brown");
		Player p3 = new Player("Erin", "Reese");
		Player p4 = new Player("John", "White");
		Player p5 = new Player("Bill", "Red");
		ArrayList<Integer> winCount = new ArrayList<Integer>();

		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p5);
		players.add(p4);

		sortTablePlayer.add(p1);
		sortTablePlayer.add(p2);
		sortTablePlayer.add(p3);
		sortTablePlayer.add(p5);
		sortTablePlayer.add(p4);

		Player lastPlayer = players.get(players.size() - 1);
		int win1 = 0, win2 = 0, win3 = 0, win4 = 0, win5 = 0;

		dealer.shuffle();

		for (int i = 0; i < 500; i++) {
			int counter = 0;
			int playerIndex = i % players.size();
			Player current = players.get(playerIndex);
			dealer.dealCard(current);

			int f = 0;

			if (lastPlayer.getCards().size() == 2) {

				Collections.sort(sortTablePlayer, new Comparator<Player>() {
					@Override
					public int compare(Player arg0, Player arg1) {
						return arg1.totalValue() - arg0.totalValue();
					}

				});

				Player winner = sortTablePlayer.get(0);

				System.out.println(winner.getFirstName() + " " + winner.getLastName() + "  is the winner.");
				winner.incrementWin();

				p1.getCards().clear();
				p2.getCards().clear();
				p3.getCards().clear();
				p4.getCards().clear();
				p5.getCards().clear();
				counter = 0;

			}
		}

		Collections.sort(sortTablePlayer, new Comparator<Player>() {
			@Override
			public int compare(Player arg0, Player arg1) {
				return arg1.getWin() - arg0.getWin();
			}

		});

		Player winner = sortTablePlayer.get(0);
		if (winner.getWin() == sortTablePlayer.get(sortTablePlayer.size() - 1).getWin()) {

			System.out.println("It's an overall tie");

		}
		System.out.println(winner.getFirstName() + " " + winner.getLastName() + " wins the game");

	}
}
