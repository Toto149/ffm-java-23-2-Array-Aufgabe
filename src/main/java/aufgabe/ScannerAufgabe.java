package aufgabe;
import java.util.Scanner;

public class ScannerAufgabe {

    public static void main(String[] args) {

        //Instanzieren des Scanner Objektes
        System.out.println("Gebe bitte ein Wort ein: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        //Gebe die Buchstaben des Wortes word einzeln aus
        System.out.println();
        System.out.println("Hier die einzelnen Zeichen der Zeichenfolge: ");
        printingEachCharacter(word);

    }

    public static void printingEachCharacter(String word){
        if(!(word instanceof String)){
            System.out.println("Es muss ein String sein!!");
            return;
        }
        char[] wordCharArray = word.toCharArray();
        for (char character : wordCharArray){
            System.out.println(character);
        }

    }
}
