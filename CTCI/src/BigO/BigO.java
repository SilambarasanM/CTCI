package BigO;


public class BigO {
public static void main(String args[]){
	
	//Recursive String Permutation O(N!)
	String str ="Chicago!";
	System.out.print("1. String Permutations for \""+str+"\" : ");
	new BigO().permutation(str);
	System.out.println();
	
	//Fibonacci Number Series up to Nth term 
	int N = 5;
	//Complexity: O(2^N)
	System.out.print("2(a). Fibonacci Series(N = "+N+"): ");
	for(int i = 0; i<N ; i++){
		System.out.print(new BigO().fib(i)+"  ");
	}
	System.out.println();
	
	//Complexity: O(N)
	System.out.print("2(b). Fibonacci Series(N = "+N+"): ");
	int memo[] = new int[N+1];
	for(int i = 0; i<N ; i++){
		System.out.print(new BigO().fib(i, memo)+"  ");
	}
	System.out.println();
}

/**
 * Returns Fibonacci Number at nth term
 * @param n - index
 * @param memo - cache array for memoization
 * @return Fibonacci number at nth position
 */
int fib(int n, int[] memo){
	if (n <= 0) return 0;
	else if(n == 1) return 1;
	else if (memo[n] > 0) return memo[n];
	
	memo[n] = fib(n-1, memo) + fib(n-2, memo);
	return memo[n];
}

/**
 * Returns Fibonacci Number at nth term
 * @param n - index
 * @return Fibonacci number at nth position
 */
int fib(int n){
	if (n <= 0) return 0;
	else if(n == 1) return 1;
	return fib(n-1) + fib(n-2);
}

/**
 * Wrapper Method for Recursive String Permutation
 * @param str - input string
 */
void permutation(String str){
	permutation(str, "");
}

/**
 * Prints all the permutations of a string
 * @param str - input string
 * @param prefix - input prefix
 */
void permutation(String str, String prefix){
	if (str.length() == 0){
		System.out.print(prefix+" ");
	}
	else{
		for (int i =0; i< str.length(); i++){
			String rem = str.substring(0,i) + str.substring(i+1);
			permutation(rem, prefix + str.charAt(i));
		}
	}
}
	
}