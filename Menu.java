import java.util.Scanner;

public class Menu {

	public static void scegli(int number) {

		Scanner in = new Scanner(System.in);
		String continua;

		do {
			switch (number) {
			case 1:
				System.out.println("Inserisci il valore da convertire:");
				SpeedConverter.printmil(in.nextDouble());
				break;
			case 2:
				System.out.println("Inserisci il valore da convertire:");
				SpeedConverter.printKm(in.nextDouble());
				break;
			case 3:
				System.out.println("Ma chi cazzo usa le miglia...");
				break;
			}

			System.out.println("\nVuoi continuare?(S/n):");
			continua = in.next();

		} while (continua.equals("S"));

	}
}
