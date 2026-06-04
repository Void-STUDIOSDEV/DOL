import java.util.Scanner;
import java.util.Random;

public class v2 {
	static int damage = 34;
	
	public static void main(String[] args) throws InterruptedException {
		Scanner Input = new Scanner(System.in);
		Random random = new Random();

		System.out.println("\nWelcome to Dispair of Life");
		Thread.sleep(1000);
		System.out.println("Open-Source from the start!");
		Thread.sleep(1000);
		System.out.println("Version 2.00.00");
		Thread.sleep(1000);
		System.out.println("VOID STUDIOS GAMES' FIRST JAVA GAME!");
		Thread.sleep(1000);
		System.out.println("PLAYER HEALTH: " + potions.phealth + " | ENEMY HEALTH: " + potions.ehealth + " | DAMAGE: " + damage);
		Thread.sleep(1000);
		
		
		
		while (true) {
			int achance = random.nextInt(5); // giving users a 1 in 5 chance to deal damage
			int eachance = random.nextInt(3); // giving the enemy a 1 in 3 chance to deal damage
			
			System.out.println("\n[A]ttack or [H]eal? [E to EXIT] / [D to DISPLAY HEALTH]");
			System.out.printf("INPUT: ");
			char a = Input.next().charAt(0);
			char b = Character.toUpperCase(a);
		
		
			if (b == 'A') {
				System.out.println("YOU ATTACK YOUR OPPONENT!");
				if (achance == 1) {
					System.out.println("You hit the opponent!");
					potions.ehealth -= damage;
					System.out.println("\nENEMY HEALTH: " + potions.ehealth);
					if (potions.ehealth > 0 && eachance == 1) {
						System.out.println("\nThe enemy attacks back!");
						potions.phealth -= damage;
						System.out.println("PLAYER HEALTH: " + potions.phealth);
					}
					else if (potions.ehealth > 0 && eachance != 1) {
						System.out.println("\nThe enemy misses!");
					}
				}
				else {
					System.out.println("\nYou miss!");
					if (eachance == 1) {
						System.out.println("\nThe enemy attacks back!");
						potions.phealth -= damage;
						System.out.println("PLAYER HEALTH: " + potions.phealth);
					}
					else {
						System.out.println("\nThe enemy misses!");
					}
				}
			}
			
			
			else if (b == 'H') {
				potions.pot();
			}
			
			else if (b == 'E') {
				System.out.println("\nA FIGHTER HAS SURRENDERED ...!\n");
				break;
			}
			
			
			else {
				System.out.println("INVALID INPUT...\n");
			}
			
			
			
			if (potions.phealth <= 0) {
				System.out.println("\nYOU HAVE DIED ...");
				Thread.sleep(1500);
				System.out.println("Rest in Peace");
				break;
			}
			else if (potions.ehealth <= 0) {
				System.out.println("\nYOU WON!");
				Thread.sleep(1500);
				System.out.println("CONGRATULATIONS ...");
				System.out.println("ANOTHER OPPONENT ENTERS THE ROOM...\n");
				potions.lpotion += 1;
				potions.spotion += 1;
			}
		}
	}
}
