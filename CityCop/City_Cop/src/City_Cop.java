import java.util.*;
public class City_Cop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		Random r = new Random();
		
		boolean flag = true;
		
		System.out.println("Welecome to City_Cop");
		System.out.println("\t# Enter your name");
		String name = input.next();
		
		GAME:
		while(flag = true) {
			System.out.println("-----------------------------------------------");
			
			
			
			Criminals c1 = new Criminals();
			int cHealth = c1.getCriminal();
			
			Player p1 = new Player();
			while (cHealth>0) {
				
				p1.getPlayer(name);
				
				System.out.println("\n\tWhat would you like to do today "+ name + "?");
				System.out.println("\t1. Capture");
				System.out.println("\t2. Apply Med Pack");
				System.out.println("\t3. Catch this criminal later");
				
				int choice = input.nextInt();
				
				switch(choice) {
				case 1:
					int damageDealt =  r.nextInt(p1.maxDamage);
					int damageTaken = r.nextInt(c1.maxDamage);
					
					cHealth -= damageDealt;
					p1.health -= damageTaken;
					
					System.out.println("\t> You strike the criminal for " + damageDealt + " damage.");
					System.out.println("\t> You recieve " + damageTaken + " in retaliation!");
					break;
				case 2:
					if(p1.medPack > 0) {
						p1.health += p1.healAmount;
						p1.medPack--;
						
						System.out.println("\t> You dring an energy drink, healing yourself for " + p1.healAmount);
						System.out.println("\t> You have " + p1.health + " HP.");
						System.out.println("\t> You have " + p1.medPack + " Med Pack left.\n");
						}
					else {
						System.out.println("\t> You have no Med Pack left capture criminals for a chance to get one!");
					}
					
				case 3:
					System.out.println("\t> You letting this criminal escape!");
					continue GAME;
				
				default:
					System.out.println("\tInvalid Command!!");
					break;
				}
				
			}
			if(p1.health<1) {
				System.out.println("\t You limp out of  City Cop , tired from duty.");
				break;
			}
			
			System.out.println("-----------------------------------------------");
			System.out.println(" # Criminal was defeated! # ");
			System.out.println(" # You have " + p1.health + " HP left. #"); 
			
			if(r.nextInt(100) < p1.medDropChance) {
				p1.medPack++;
				System.out.println(" # Criminal dropped a energy drink! # ");
				System.out.println(" # You now have " + p1.medPack + " Med Pack . #");
			}
			System.out.println("-----------------------------------------------");
			System.out.println("What would you like to do now?");
			System.out.println(" 1. Continue advanture");
			System.out.println(" 2. Exit City Cop");
			
			int s1 = input.nextInt();
			
			while(s1!=1 && s1!=2) {
				System.out.println("Invalid Command");
				s1=input.nextInt();
			}
		
			if(s1==1) {
				System.out.println(" You continue on your advanture!");
			}
			else if(s1==2) {
				System.out.println(" You exit the City Cop, scuccessful from your advantures!");
				break;
			}
			
		}
		
		System.out.println("#######################################");
		System.out.println("#          THANKS FOR PLAYING!        #");
		System.out.println("#######################################");

	}

}
