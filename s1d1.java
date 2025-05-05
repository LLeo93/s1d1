package s1d1;

import java.util.Arrays;
import java.util.Scanner;

public class s1d1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Inserisci la prima stringa: ");
        String prima = scanner.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String seconda = scanner.nextLine();

        String normale = concatena(prima, seconda);
        String inversa = concatena(seconda, prima);

        System.out.println("Concatenazione normale: " + normale);
        System.out.println("Concatenazione inversa: " + inversa);


        String[] originalArray = {"uno", "due", "tre", "quattro", "cinque"};
        String daInserire = "dieci";
        String[] nuovoArray = inserisciInTerzaPosizione(originalArray, daInserire);
        System.out.println(Arrays.toString(nuovoArray));


        System.out.print("Inserisci la lunghezza del rettangolo: ");
        String lato1String = scanner.nextLine().replace(",", ".");
        double lato1 = Double.parseDouble(lato1String);

        System.out.print("Inserisci la larghezza del rettangolo: ");
        String lato2String = scanner.nextLine().replace(",", ".");
        double lato2 = Double.parseDouble(lato2String);

        double perimetro = perimetroRettangolo(lato1, lato2);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);


        System.out.println("inserire un numero intero");
        int numero = scanner.nextInt();
        scanner.nextLine();
        int risultato = pariDispari(numero);
        System.out.println("pari 0 dispari 1 il tuo numero è :"+ risultato);

        System.out.print("Inserisci il primo lato del triangolo: ");
        double la = Double.parseDouble(scanner.nextLine().replace(",", "."));

        System.out.print("Inserisci il secondo lato del triangolo: ");
        double lb = Double.parseDouble(scanner.nextLine().replace(",", "."));

        System.out.print("Inserisci il terzo lato del triangolo: ");
        double lc = Double.parseDouble(scanner.nextLine().replace(",", "."));

        double perimetroDue = perimetroTriangolo(la, lb, lc);
        System.out.println("Il perimetro del triangolo è: " + perimetroDue);
    }

    public static String[] inserisciInTerzaPosizione(String[] arrayOriginale, String nuovaStringa) {
        String[] nuovoArray = new String[arrayOriginale.length + 1];

        for (int i = 0; i < 2; i++) {
            nuovoArray[i] = arrayOriginale[i];
        }

        nuovoArray[2] = nuovaStringa;

        for (int i = 2; i < arrayOriginale.length; i++) {
            nuovoArray[i + 1] = arrayOriginale[i];
        }

        return nuovoArray;
    }

    public static String concatena(String s1, String s2) {
        return s1 + s2;
    }

    public static double perimetroRettangolo(double l1, double l2) {
        return 2 * (l1 + l2);
    }
    public static int pariDispari(int p) {
        if (p % 2 == 0) {return 0;}
        else{return 1;}
    }
    public static double perimetroTriangolo (double la, double lb, double lc) {
        return la + lb + lc;
    }
}
