package Chapter1;

public class Question1 {
	final static int totalChars = 128;	//Possible unique ASCII values
	final static int wordSize = 5;		//Maximum number of bits required to represent 128 characters
	final static int wordValue = (int)Math.pow(2,wordSize) - 1;	//Integer representation of 5 1's (11111)
	
	public static boolean isUnique(String str) {
		int set0 = 0, set1 = 0, set2 = 0, set3 = 0;
		int checker, newVal;
		for (int i = 0; i < str.length(); ++i) {
			int val = str.charAt(i);
			newVal = val & wordValue;	//
			switch(val>>wordSize){
			case 0: checker = set0; 
					if ((checker & (1 << newVal)) > 0) return false;
					checker |= (1 << newVal);
					set0 = checker;
					break;
			case 1: checker = set1; 
					if ((checker & (1 << newVal)) > 0) return false;
					checker |= (1 << newVal);
					set1 = checker;
					break;
			case 2: checker = set2; 
					if ((checker & (1 << newVal)) > 0) return false;
					checker |= (1 << newVal);
					set2 = checker;
					break;
			case 3: checker = set3; 
					if ((checker & (1 << newVal)) > 0) return false;
					checker |= (1 << newVal);
					set3 = checker;
					break;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if (isUnique(str))
			System.out.println("The given string is unique.");
		else
			System.out.println("The given string is not unique.");
	}
	
}