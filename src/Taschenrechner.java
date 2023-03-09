import java.util.Scanner;
public class Taschenrechner {
    public static void main(String [] args) {
        final String PLUS = "+";
        final String MINUS = "-";
        final String MAL = "*";
        final String GETEILT = "/";
        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl Eins Eingeben: ");
        int zahlEins = scanner.nextInt();
        System.out.println("Zahl Zwei Eingeben: ");
        int zahlZwei = scanner.nextInt();
        // Zeichen als String einlesen
        System.out.println("Zeichen Eingeben: ");
        String zeichen = scanner.next();
        boolean korrekteEingabe = false;
        // Ergebnis
        int ergebnis;

        if ((zahlZwei > 0 && zahlZwei < 1000) && (zahlEins > 0 && zahlEins < 1000)) {
            korrekteEingabe = true;
        } else {
            System.out.println("Eingabefehler");
            scanner.close();
        }

        if (korrekteEingabe) {

            switch (zeichen) {
                case PLUS:
                    ergebnis = zahlEins + zahlZwei;
                    System.out.println("Ergebnis: " + ergebnis);
                    break;
                case MINUS:
                    ergebnis = zahlEins - zahlZwei;
                    System.out.println("Ergebnis: " + ergebnis);
                    break;
                case MAL:
                    ergebnis = zahlEins * zahlZwei;
                    System.out.println("Ergebnis: " + ergebnis);
                    break;
                case GETEILT:
                    ergebnis = zahlEins / zahlZwei;
                    System.out.println("Ergebnis: " + ergebnis);
                    break;
                default:
                    System.out.println("Eingabefehler");
            }
        }
        scanner.close();
    }

}
