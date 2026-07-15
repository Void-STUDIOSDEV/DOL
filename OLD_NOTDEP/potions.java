import java.util.Scanner;

public class potions {
	// Public static variables so any external file can access them directly
	public static int phealth = 100; // player health, 100
	public static int ehealth = 120; // enemy health, 120
	public static int spotion = 1; // small potions adds 5HP points to health
	public static int lpotion = 1; // large potions adds 35HP points to health
	public static int spotion_amount = 5; // this is so small potions can actually heal.
	public static int lpotion_amount = 35; // this is so large potions can actually heal.

	public static void pot(/*String[] args*/) throws InterruptedException {
		Scanner Input = new Scanner(System.in);
		
		while (true) {
			if (phealth >= 80) {
				System.out.println("WARNING: YOU HAVE TO MUCH HEALTH POINTS. YOU HAVE TO BE 80-HP TO USE POTIONS");
				break;
			}
			
			else if (phealth <= 80) {
				Thread.sleep(1000);
				System.out.println("INVENTORY: [S]MALL POTIONS [" + spotion + "] | [L]ARGE POTIONS [" + lpotion + "]");
				Thread.sleep(1000);
				System.out.printf("INPUT: ");
				char c = Input.next().charAt(0);
				char d = Character.toUpperCase(c);
				
				if (d == 'S') {
					if (spotion <= 0) {
						System.out.println("Sorry! You are out of Small Potions! Defeat opponents to get more!\n");
						break;
					}
					else if (spotion >= 1) {
						System.out.println("Using potion!\n");
						spotion -= 1;
						phealth += spotion_amount;
						System.out.println("HEALTH: " + phealth);
						break;
					}
				}
				
				
				else if (d == 'L') {
					if (lpotion <= 0) {
						System.out.println("Sorry! You are out of Large Potions! Defeat an opponents to get more!\n");
						break;
					}
					else if (lpotion >= 1) {
						System.out.println("Using potion!\n");
						lpotion -= 1;
						phealth += lpotion_amount;
						System.out.println("HEALTH: " + phealth);
						break;
					}
				}
				
				
				else {
					System.out.println("Invalid choice!\n");
				}
			}
		}
	}
}
