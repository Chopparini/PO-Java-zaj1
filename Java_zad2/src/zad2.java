//Paulina Piotrowska 2K333
import java.util.Scanner;

public class zad2 {

    public static void main(String[] args) {
        int a,b,c;
        int sumka=0;

        System.out.println("Podaj trzy liczby calkowite oddzielone spacją");
        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();
        if (a!=13) {
            if (b != 13) {
                if (c != 13) {
                    sumka = a + b + c;
                } else {
                    sumka = a + b;
                }
            }
            else sumka = a;

        }
            System.out.println("Suma jest rowna " + sumka);

        }

    }
