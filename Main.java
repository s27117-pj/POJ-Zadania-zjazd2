/*public class Main {
    public static void main(String[] args) {
        System.out.println("imie: Filip");
        System.out.println("nazwisko: Kononiuk");
        System.out.println("grupa: 22c");
        System.out.println("kierunek: Informatyka");
//ZADANIE 2.1
    }
}
     */

/*import java.util.Scanner;

class Studia{
public static void main(String[] args) {
    System.out.println("podaj imie: ");
    Scanner scan = new Scanner(System.in);
    String name = scan.nextLine();
    System.out.println("podaj nazwisko: ");
    Scanner scan2 = new Scanner(System.in);
    String name2 = scan.nextLine();
    System.out.println("podaj grupe: ");
    Scanner scan3 = new Scanner(System.in);
    String name3 = scan.nextLine();
    System.out.println("podaj kierunek studiow: ");
    Scanner scan4 = new Scanner(System.in);
    String name4 = scan.nextLine();
    System.out.println("imie: " + name);
    System.out.println("nazwisko: " + name2);
    System.out.println("grupa: " + name3);
    System.out.println("kierunek studiow: " + name4);
         }
    }
    //ZADANIE 2.2
 */

/*public class Main {
    public static void main(String[] args) {
        int i=0;
        short s=0;
        long l=0L;
        float f=0.0f;
        double d=0.0;
        char c ='\u0000';
        String str = null;
        boolean bool=false;
        System.out.println("int: " +i);
        System.out.println("short: " +s);
        System.out.println("float: " +f);
        System.out.println("long: " +l);
        System.out.println("double: "+d);
        System.out.println("char: " +c);
        System.out.println("string: " +str);
        System.out.println("boolean: " +bool);
    }
}
//ZAD 2.3
 */

/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj wysokość walca: ");
        double wysokosc = scanner.nextDouble();
            System.out.print("Podaj promień podstawy walca: ");
        double promien = scanner.nextDouble();
        double pojemnosc=Math.PI*promien*promien*wysokosc;
            System.out.println("Pojemność walca wynosi: " + pojemnosc);
    }
}
//ZAD 2.7
 */
/*public class Main {
    public static void main(String[] args) {
        int[][] tablica = {{0, 10, 20}, {1, 11, 21}, {2, 12, 22}};
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        int[] temp = tablica[0];
        tablica[0] = tablica[2];
        tablica[2] = temp;
        System.out.println("Po zamianie wierszy:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }
}
//ZAD 2.6
 */

/*
public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 14; i++) {
            System.out.println("2 do potęgi " + i + " wynosi " + Math.pow(2, i));
        }
    }
}
//ZAD 2.10
*/



