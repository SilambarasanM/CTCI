package Chapter1;

public class Question3 {
public static void main(String a[]){
	
	//Input: Actual length of the string
	int n = 13;
	//Input: String with enough spaces for transformation
	String str = "Mr John Smith    "; 
	char[] copyChar = new char[str.length()];
	char[] charArray = str.toCharArray();
	URLify(charArray, copyChar, n);
}
public static void URLify(char[] charArray, char[] copyChar, int n){
	
	int j = 0;
	int i = 0;
	while (i <n){
		if (charArray[i] == ' '){
			copyChar[j++] = '%';
			copyChar[j++] = '2';
			copyChar[j++] = '0';
		}
		else
			copyChar[j++] = charArray[i];
		i++;
	}
	System.out.print("URLified String: ");
	System.out.println(copyChar);
}
}
