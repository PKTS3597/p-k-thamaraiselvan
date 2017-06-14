package guvi;

public class reversestring {
public static void main(String[] args) {
	String string="mugesh";
	String reverse=new StringBuffer(string).reverse().toString();
	System.out.println("\n String before reverse :"+string);
	System.out.println("\n String after reverse :"+reverse);
	}
}
