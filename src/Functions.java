/** Hausaufgabe 2 von Philipp Amoei (Matrikelnummer 7322302) */

public class Functions {
	public static void main(String[] args) {
		
		//Aufgabenteil a) Dritte Potenz einer Zahl
		
		System.out.println("Teil a) \nDie dritte Potenz von 5 ist: " + cube(5) + "\n\n" + "Teil b)");
						
		//Aufgabenteil b) Vergleichen eines Strings und einer Integer
		
		System.out.println("String 5 und int 5 liefern: " + compare("5", 5) + "\n");
		System.out.println("String -3 und int -3 liefern: " +compare("-3", -3) + "\n");
		System.out.println("String 5 und int 3 liefern: " +compare("5", 3) + "\n");
		System.out.println("String -3 und int 3 liefern: " +compare("-3", 3) + "\n");
	}
	
//Funktion zur Potenzierung (Teil a))
	public static double cube(int zahl) {
		double ergebnis = Math.pow(zahl, 3);
		
		return ergebnis;
	}

//Funktion zum Vergleich (Teil b))
	public static boolean compare(String text, int zahl) {
		
	boolean check;	//Variable fuer Wahrheitswert
		
		check = Integer.valueOf(text) == zahl;	// Vergleich ob Stringwert == intwert
		
	return check;		//Wahrheitswert zurueckgeben
	}
}
