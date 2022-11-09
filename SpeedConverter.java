
public class SpeedConverter {

	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			return -1;
		}

		return Math.round(kilometersPerHour / 1.609);

	}

	public static long toKmPerHour(double miglia) {
		if (miglia < 0) {
			return -1;
		}

		return Math.round(miglia * 1.609);
	}

	public static void printmil(double kilometersPerHour) {

		double miles = SpeedConverter.toMilesPerHour(kilometersPerHour);

		if (miles == -1) {
			System.out.println("Invalid value");
		} else {

			System.out.println(kilometersPerHour + " km/h = " + miles + " mi/h");
		}
	}

	public static void printKm(double milesPerHour) {

		double kilometers = SpeedConverter.toKmPerHour(milesPerHour);

		if (kilometers == -1) {
			System.out.println("Invalid value");
		} else {
			System.out.println(milesPerHour + " mi/h = " + kilometers + " km/h");

		}

	}

}
