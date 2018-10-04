//Paulina Piotrowska 2K333
import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.util.Scanner;

public class zad1
{

    private static boolean nastka(int a, int b)
    {
            boolean t=false;

            if (a >= 13 && a <= 19)
            {
                if (b < 13 || b > 19)
                {
                    t = true;
                }

            } else if (b >= 13 && b <= 19)
            {
                t = true;

            }
            return t;
        }
    public static void main(String[] args) {
        int x;
        int y;

        System.out.println("Podaj dwie liczby calkowite oddzielone spacją");
        Scanner keyboard = new Scanner(System.in);
        x = keyboard.nextInt();
        y = keyboard.nextInt();

        System.out.println(nastka (x,y));

    }
}


