/** Hausaufgabe 2 von Philipp */

/**
 * In der Klasse `Operators` finden Sie `@@@` an einigen Stellen. 
 * Dadurch handelt es sich nicht um ein lauffähiges Programm, und Eclipse wird einige Fehlermeldungen anzeigen. 
 * Bei `@@@` handelt es sich um Platzhalter, die Sie durch je einen Operator ersetzen sollen. 
 * Ersetzen Sie so, dass die in den Kommentaren angegebenen Ergebnisse für die Variable j herauskommen.
 * Verwenden Sie gerne die Funktion `System.out.println()` um das Ergebnis zu überprüfen.
 *
 */
public class Operators {
	public static void main(String[] args) {
		int i;
		int j;
		boolean b;
		i = 5;
		
		
		j = 5 + 5; // 10
		System.out.println("Wert fuer j = 5 + 5 ist: " + j + "\n");
		
		j = 5 * 5 / 5 * 2; // 10
		System.out.println("Wert fuer j = 5 * 5 / 5 * 2 ist: " + j + "\n");
		
		j = i - 10 * i + 10; // -35
		System.out.println("Wert fuer j = i - 10 * i + 10 ist: " + j + "\n");
		
		b = i + 1 > i - 1; // true
		System.out.println("Wert fuer b = i + i > i - 1 ist: " + b);
	}
}
