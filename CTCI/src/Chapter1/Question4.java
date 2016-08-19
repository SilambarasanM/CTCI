package Chapter1;

public class Question4 {

	public static void main(String[] args) {
		String word = "Tact Coa";
		System.out.println("Palindome Permutation: "+palindromePermute(word));
	}
	public static boolean palindromePermute(String word){
		char[] charArray = word.toLowerCase().toCharArray();
		int[] set = new int[4];
		set[0] = set[1] = set[2] = set[3] = 0;
		int len = 0;
		for(char key : charArray){
			if (key != ' '){
				int value = key;
				int index = value>>5; 
				int checker = set[index];
				int newVal = value & 31; 
				if ((checker & (1 << newVal)) != 0)	//Checking if bit is set or not
					checker = checker & ~(1 << newVal);	//resetting the bit to 0
				else
					checker |= (1 << newVal);	//setting the bit to 1
				set[index] = checker;
				//printBits(set[index]);
				len++;
		}
			else
				continue;
		}
		int count =0;
		for(int val: set){ //printBits(val);
		if(val != 0) count++;}
		if(count > 0) 
			if (len%2 != 0) return true;
			else return false;
		else
			if(len%2 == 0) return true;
		return false;
	}
	public static void printBits(int n){
		for(int i = 31; i >=0; i--){
			if ((n & (1<<i))!= 0)
				System.out.print(1);
			else
				System.out.print(0);
		}
		System.out.println();
	}
}
