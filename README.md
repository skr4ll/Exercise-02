# Hausaufgabe 2

Hinweis: Wenn hier und in folgenden Aufgaben aufgefordert wird, Code zu schreiben, dann sollte der Code am Ende a) fehlerfrei compilierbar sein (Eclipse zeigt im Tab "Problems" keine Errors mehr an) und b) lauffähig sein (der Code lässt sich ausführen, ohne dass Fehlermeldungen erscheinen.

## Teil 1: Operatoren

In der Klasse `Operators` finden Sie `@@@` an einigen Stellen. Dadurch handelt es sich nicht um ein lauffähiges Programm, und Eclipse wird einige Fehlermeldungen anzeigen. Bei `@@@` handelt es sich um Platzhalter, die Sie durch je einen Operator ersetzen sollen. Ersetzen Sie so, dass die in den Kommentaren angegebenen Ergebnisse herauskommen. Überprüfen Sie Ihre Operatorensetzung durch das Einfügen von Ausgaben (`System.out.println`).

## Teil 2: Funktionen

Im Folgenden sollen Sie zwei Funktionen schreiben. Es ist sinnvoll, zuerst den Rahmen zu schreiben: Also die Deklaration mit Rückgabewert und Argumenten, mit zunächst leerem Körper. Sie können danach innerhalb der `main`-Funktion Code schreiben, um die Funktionen aufzurufen (und zu testen). Erst danach sollten Sie sich an den Inhalt der Funktionen setzen.

a) Schreiben Sie -- in der Klasse `Functions` -- eine Funktion namens `cube`, die zu einer integer-Zahl ihre dritte Potenz ("hoch 3") zurückliefert. Für 5 soll also 125 zurückgegeben werden etc.

b) Schreiben Sie eine weitere Funktion namens `compare`, die zwei Argumente nimmt. Das erste Argument ist ein `String`, das zweite ein `int`-Wert. Die Funktion soll dann, mit der Funktion `System.out.println()` true ausgeben, wenn der String und die int-Variable den gleichen numerischen Wert enthalten. Sie können die Funktion `Integer.valueOf()` verwenden, um den int-Wert aus dem String zu erhalten. Bei den folgenden Aufrufen sollte also `true` zurückgegeben werden: `compare("5", 5)`, `compare("-3", -3)`, bei den folgenden ist die Ausgabe `false`: `compare("5", 3)`, `compare("-3",3)`. 