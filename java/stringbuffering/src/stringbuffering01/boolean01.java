package stringbuffering01;

public class boolean01 {
public static void main(String[] args) {

		String s1 = new String ("avinash ");
		String s2 = new String ("avinash ");	
    System.out.println( s1 == s2);
    System.out.println(s1.equals(s2));
    
    String A = "hello java ";
    		A.concat("java");
    System.out.println(A);
    
    StringBuffer sb =new StringBuffer("hello java");
    sb.append("Avinash");
    System.out.println(sb);
    
    
    String Firstname = "Avinash";
    String lastname ="saxena";
    String name = Firstname + lastname;
    System.out.println(name);
    
    
    
    
    
}


}
