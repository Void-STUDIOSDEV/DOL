import java.util.Scanner;
import java.util.Random;
import java.util.Locale;

public class v1 {
	static int phealth = 100;
	static int ehealth = 120;
	static int damage = 34;
	
	public static void main(String[] args) throws InterruptedException {
		Scanner Input = new Scanner(System.in);
		Random random = new Random();
		//int achance = random.nextInt(4); // giving users a 1 in 4 chance to deal damage
		//int eachance = random.nextInt(3); // giving the enemy a 1 in 3 chance to deal damage
		//int pchance = random.nextInt(96); // giving the chance for the potion to heal up to 95HP

		System.out.println("Welcome to Despair of Life");
		System.out.println("Version 1.00.00");
		Thread.sleep(1000);
		System.out.println("A quick little JAVA game using randomness!");
		Thread.sleep(1000);
		System.out.println("PLAYER HEALTH: " + phealth + " | ENEMY HEALTH: " + ehealth + " | DAMAGE: " + damage);
		Thread.sleep(1000);
		System.out.println("HEALTH POTION REGEN: 1HP-95HP");
		Thread.sleep(1000);
		
		
		
		while (true) {
			int achance = random.nextInt(5); // giving users a 1 in 5 chance to deal damage
			int eachance = random.nextInt(3); // giving the enemy a 1 in 3 chance to deal damage
			int pchance = random.nextInt(96); // giving the chance for the potion to heal up to 95HP
			
			System.out.println("\n[A]ttack or [H]eal?");
			System.out.printf("INPUT: ");
			char a = Input.next().charAt(0);
			char b = Character.toUpperCase(a);
		
		
			if (b == 'A') {
				System.out.println("YOU ATTACK YOUR OPPONENT!");
				if (achance == 1) {
					System.out.println("You hit the opponent!");
					ehealth -= damage;
					System.out.println("\nENEMY HEALTH: " + ehealth);
					if (ehealth > 0 && eachance == 1) {
						System.out.println("The enemy attacks back!");
						phealth -= damage;
						System.out.println("PLAYER HEALTH: " + phealth);
					}
					else if (ehealth > 0 && eachance != 1) {
						System.out.println("The enemy misses!");
					}
				}
				else {
					System.out.println("You miss!");
					if (eachance == 1) {
						System.out.println("The enemy attacks back!");
						phealth -= damage;
						System.out.println("PLAYER HEALTH: " + phealth);
					}
					else {
						System.out.println("The enemy misses!");
					}
				}
			}
			
			
			else if (b == 'H') {
				if (phealth >= 80) {
					System.out.println("You have too much Health Points [Requires sub 80HP]. To make the game actually difficult, you cannot heal yet!");
				}
				if (phealth <= 80) {
					System.out.println("You use a potion! You have a chance to get health back!");
					phealth += pchance;
					System.out.println("NEW AMOUNT: " + phealth);
				}
			}
			
			else {
				System.out.println("INVALID INPUT...\n");
			}
			
			
			
			if (phealth == 0) {
				System.out.println("\nYOU HAVE DIED ...");
				Thread.sleep(1500);
				System.out.println("Rest in Peace");
				break;
			}
			else if (ehealth == 0) {
				System.out.println("\nYOU WON!");
				Thread.sleep(1500);
				System.out.println("CONGRATULATIONS ...");
				System.out.println("ANOTHER OPPONENT ENTERS THE ROOM...\n");
			}
		}
	}
}
