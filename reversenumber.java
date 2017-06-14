package guvi;

public class reversenumber {
public int reversenumber(int number){
		
		int reverse = 0;
		while(number != 0){
			reverse = (reverse*10)+(number%10);
			number = number/10;
		} 
		return reverse;
	}
	
	public static void main(String a[]){
		reversenumber rn = new reversenumber();
		System.out.println("Result: "+rn.reversenumber(17868));
	}
}
