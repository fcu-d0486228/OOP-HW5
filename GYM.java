package fcu.iecs.oop.pokemon;

public class GYM {
	public static void fight(Pokemon p1, Pokemon p2) {
		int rand = (int)(Math.random()*50)+1; // 1~50
		
		if (rand % 2 != 0) {
			System.out.println("Winner is " + p1.getName() + ".");
			p1.setCp(p1.getCp() + 500);
		} else {
			System.out.println("Winner is " + p2.getName() + ".");
			p2.setCp(p2.getCp() + 500);
		}
	}
}
