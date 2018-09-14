
public class Player {
	
	static int health = 100;
	static int maxDamage = 40;
	static int medPack = 3;
	static int healAmount = 25;
	static int medDropChance = 30; //Percentage
	
	public static void getPlayer(String name){
		System.out.println("\t# " + name + " reporting for duty #");
		System.out.println("\t# "+ name + "'s HP: " + health);
	}

}
