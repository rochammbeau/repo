package game.actors;

import java.util.ArrayList;

import game.objects.Card;

public class GameRoom {

	private Dealer dealer;
	ArrayList<Player> players = new ArrayList<Player>();

	public GameRoom(Dealer dealer, ArrayList<Player> players) {

		this.dealer = dealer;
		this.players = players;

	}

	public static void main(String args[]) {

		Dealer dealer = new Dealer("Joe", "Smith");
		ArrayList<Player> players = new ArrayList<Player>();
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

				int s1 = p1.totalValue();

				int s2 = p2.totalValue();

				int s3 = p3.totalValue();
				int s4 = p4.totalValue();
				int s5 = p5.totalValue();

				int max = (Math.max(s1, s2));
				int max2 = (Math.max(s2, s3));
				int max3 = (Math.max(s4, s5));
				int max4 = (Math.max(s5, s2));
				int max5 = (Math.max(s4, s3));

				int z = Math.max(max, max2);
				int y = Math.max(max5, max4);
				int x = Math.max(z, y);

				boolean a = (x == s3 && x == s2);
				boolean b = (x == s1 && x == s2);
				boolean c = (x == s3 && x == s1);
				boolean d = (x == s4 && x == s5);
				boolean e = (x == s5 && x == s2);
				boolean h = (x == s5 && x == s3);
				boolean g = (x == s4 && x == s3);
				counter = 0;
				if (a || b || c || d || e || h || g) {

					System.out.println("Its a tie.");

					counter++;
				} else if (x == s1) {

					System.out.println(p1.getFirstName() + " " + p1.getLastName() + " Is the winner.");
					win1++;
					if (counter == 1) {
						win1--;
					}
				} else if (x == s2) {

					System.out.println(p2.getFirstName() + " " + p2.getLastName() + " Is the winner.");
					win2++;
					if (counter == 1) {
						win2--;
					}
				} else if (x == s3) {

					System.out.println(p3.getFirstName() + " " + p3.getLastName() + " Is the winner.");
					win3++;
					if (counter == 1) {
						win3--;
					}
				} else if (x == s4) {

					System.out.println(p4.getFirstName() + " " + p4.getLastName() + " Is the winner.");
					p4.incrementWin();
					
					if (counter == 1) {
						win4--;
					}
				} else if (x == s5) {

					System.out.println(p5.getFirstName() + " " + p5.getLastName() + " Is the winner.");
					p5.incrementWin();
					if (counter == 1) {
						win5--;
					}

				}

				p1.getCards().clear();
				p2.getCards().clear();
				p3.getCards().clear();
				p4.getCards().clear();
				p5.getCards().clear();
				counter = 0;

			}
		}

		int max = (Math.max(win1, win2));
		int max2 = (Math.max(win2, win3));
		int max3 = (Math.max(max, max2));
		int max4 = (Math.max(max3, win5));
		int max5 = (Math.max(max4, win4));
		int max6 = (Math.max(win5, win1));
		int max7 = (Math.max(win3, max6));
		int max8 = (Math.max(max7, max5));

		boolean a = (max3 == win1 && max3 == win2);
		boolean b = (max3 == win2 && max3 == win3);
		boolean c = (max3 == win3 && max3 == win1);

		if (win1 == max5) {

			System.out.println(p1.getFirstName() + " Is the overall winner!");

		}
		if (win2 == max5) {
			System.out.println(p2.getFirstName() + " Is the overall winner!");
		}
		if (win3 == max3) {

			System.out.println(p3.getFirstName() + " Is the overall winner!");

		}
		if (win4 == max5) {

			System.out.println(p4.getFirstName() + " Is the overall winner!");

		}
		if (win5 == max5) {

			System.out.println(p5.getFirstName() + " Is the overall winner!");

		}

		if (a) {

			System.out.println("Tie between " + p1.getFirstName() + " and " + p2.getFirstName());

		} else if (b) {

			System.out.println("Tie between " + p3.getFirstName() + " and " + p2.getFirstName());

		} else if (c) {

			System.out.println("Tie between " + p1.getFirstName() + " and " + p3.getFirstName());

		} else if (a && b && c) {

			System.out.println("ALL TIED");

		}

	}
}
