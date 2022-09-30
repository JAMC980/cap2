import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) 
    {
        try (Scanner entrada = new Scanner(System.in)) 
        {
            int num1,num2,num3,num4,num5;
              
            System.out.println("\nIntroduzca 5 enteros.");
            System.out.println("Introduzca el primer entero:");
            num1 = entrada.nextInt();
              
            System.out.println("Introduzca el segundo entero:");
            num2 = entrada.nextInt();
              
            System.out.println("Introduzca el tercer entero:");
            num3 = entrada.nextInt();
              
            System.out.println("Introduzca el cuarto entero:");
            num4 = entrada.nextInt();
              
            System.out.println("Introduzca el quinto entero:");
            num5 = entrada.nextInt();

            System.out.println(num1+ " " + " " + " " +num2+ " " + " " + " " +num3+ " " + " " + " " +num4+ " " + " " + " " +num5);

        }

    }
    
}