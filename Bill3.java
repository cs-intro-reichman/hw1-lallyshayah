// Splits a restaurant bill evenly among three diners.
public class Bill3 
{
	public static void main(String[] args)
	{
		
		String n1 = args[0];
		String n2 = args[1];
		String n3 = args[2];
		int value = Integer.parseInt(args[3]);
		
		
		double newValue;
		
		if (value % 3 != 0)
		{
			newValue = value / 3 + 1;
		}
		
		else 
		{
			newValue = value / 3;
		}

		System.out.println("Dear " + n1 + ", " + n2 + " and " + n3 + ": pay " + newValue + " Shekels each.");

	}
}
