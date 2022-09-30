import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args)
    {
        int a,b,c;
        b=2;
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Escriba un entero:");
            a = sc.nextInt();

            c=a*b;
            //programa va a realizar un calculo de nomina de muestra.
            System.out.println("C es igual a:"+c);
        } 

    }
}