
public class Übungstools {

	public static void main(String[] args) {
		int würfe = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		while (würfe < 51) {

			int Ergebnis = Zufall.getZufallInt(1, 6);

			würfe = würfe + 1;
			if (Ergebnis == 1) {
				one = one + 1;
			} else if (Ergebnis == 2) {
				two = two + 1;
			} else if (Ergebnis == 3) {
				three = three + 1;
			} else if (Ergebnis == 4) {
				four = four + 1;
			} else if (Ergebnis == 5) {
				five = five + 1;
			} else if (Ergebnis == 6) {
				six = six + 1;
			}
		}

		System.out.println("1: " + one);
		System.out.println("2: " + two);
		System.out.println("3: " + three);
		System.out.println("4: " + four);
		System.out.println("5: " + five);
		System.out.println("6: " + six);
	}
}
