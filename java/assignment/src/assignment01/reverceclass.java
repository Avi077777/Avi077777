package assignment01;

public class reverceclass {
	public static void main(String[] args) {

		String str = "vijay dinanth chauhan";
		char charArray[] = str.toCharArray();
		
		String rev = "";
		
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + charArray[i];

		}

		System.out.println(rev);
	}
}
