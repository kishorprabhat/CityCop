import java.util.*;

public class Criminals {
	
	static Random r = new Random();
	
	//Types of Criminals
	static String [] typeCriminals = {"Thieves","Kidnapper","Muderer","Serial_Killer","Rapist","Terrorist","Assassin"};
	
	private static int maxHealth = 50;
	public static int maxDamage = 30;
	
	public static int getCriminal(){
		int health = r.nextInt(maxHealth);
		String criminal = typeCriminals[r.nextInt(typeCriminals.length)];
		
		System.out.println("\t# " + criminal + " found!     HP "+ health + "#\n");
		
		return health;
	}
	
	

}
