// Computes the future value of a saving investment.
public class FVCalc
 {
	public static void main(String[] args)
	{
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);




		double futureValue;

		futureValue = (double) (currentValue * Math.pow((1 + (double) rate / 100.0) , n));

		System.out.println("After " + n + " years, a " + "$" + currentValue + " saved at " + (double) rate + "%" + " will yield " + "$" + (int) futureValue);



	}
}