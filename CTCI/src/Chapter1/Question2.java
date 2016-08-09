package Chapter1;
import java.util.HashMap;

public class Question2 {

	public static void main(String[] args) {
		String str1 = "Summer";
		String str2 = "Hummer";
		if (checkPermutation(str1,str2))
			System.out.println("String 2 is a permutation of String 1.");
		else if (checkPermutation(str2,str1))
			System.out.println("String 1 is a permutation of String 2.");
		else
			System.out.println("Not a permutation.");

	}
	private static boolean checkPermutation(String s1, String s2){
		HashMap<Character, Integer> hash_table = new HashMap<Character, Integer>();
		for (int i =0; i <s1.length(); i++){
			Character key = s1.charAt(i);
			int value = 0;
			if (hash_table.get(key) != null)
				value = hash_table.get(key) + 1;
			hash_table.put(key, value);
				
			}
		for (int i =0; i <s2.length(); i++){
			Character key = s2.charAt(i);
			if (hash_table.get(key) == null)
				return false;
			else{
				int value = hash_table.get(key);
				if (value>=0)
					hash_table.put(key, value-1);
				else return false;
				}
		}
		return true;
	}
}
