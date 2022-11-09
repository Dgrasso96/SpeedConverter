import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("*** CONVERTITORE km/h in mi/h & mi/h in km/h ***");
		System.out.println("\n1. km/h ==> mi/h");
		System.out.println("2. mi/h ==> km/h");
		System.out.println("3. Ester egg");

		Menu.scegli(in.nextInt());
	}

}
