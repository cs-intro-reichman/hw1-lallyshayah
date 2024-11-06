import java.util.Scanner;
import java.io.*;
import java.util.Arrays;


// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:

		Scanner s = new Scanner(System.in);

		String str1 = s.nextLine();
		String str2 = s.nextLine();
		String str3 = s.nextLine();


		System.out.println("Please enter a number: ");
		double num = s.nextInt();
		double Nnum = num / 3;
		Nnum = Math.ceil(Nnum);

		System.out.println("Dear " + str1 + ", " + str2 + " and " + str3 + ": " + "pay ");


	}
}
