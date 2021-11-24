package stringbuffering01;

public class Exercise {
public static void main(String[] args) {
	String s = "Vijay Chauchan";
	System.out.println("full name  -  "+ s);
	
	String A[]= s.split(" ");
	System.out.println(" Last Name    -   "+ A[A.length-1]);
	
	int count =0;
	for(int i=0 ; i<s.length();i++) {
		if(s.charAt(i)=='a') {
			count++;
			
		}
	}
	System.out.println("a");
	System.out.println(count);	
}
}
