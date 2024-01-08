package digits;

public class Prime_number {
	
	public static void main(String[] args) {
		
		int num=11;
		
		boolean isnumPrime=true;
		for (int i = 2; i < num; i++) {
			
			if(num%i==0)
			{
				isnumPrime=false;
				break;
			}
		}
		
		if(isnumPrime)
			System.out.println("It's a Prime number");
		else
			System.out.println("It's not a prime number");
	}
}
