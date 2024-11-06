// Generates three integer random numbers in a given range,
// and prints them in increasing order.
import java.util.Random;

public class Ascend
{
	public static void main(String[] args) 
	{
		int lim = Integer.parseInt(args[0]);
		Random random = new Random();
        
        // Generate 3 random numbers between 0 and lim (inclusive)
        int a = random.nextInt(lim);  
        int b = random.nextInt(lim);
        int c = random.nextInt(lim);

		System.out.println(a + " " + b + " " + c);
		int min = Math.min (Math.min(a,b) , Math.min(b,c));
		int max = Math.max (Math.max(a,b) , Math.max(b,c));
		int mid = a + b + c - max - min;

		System.out.println(min + " " + mid + " " + max);
		
	}
}
