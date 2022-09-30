import java.util.Scanner;

public class Ejercicio6 {


        public static boolean esPar(int numero) {
            return numero % 2 == 0;
        }
    
        public static void main(String[] args) {
            int numero;
            try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Introduzca el primer entero:");
            numero = sc.nextInt();
            if (esPar(numero)) {
                System.out.println("Sí es par");
            } else {
                System.out.println("No es par");
            }
        }
    }
}     