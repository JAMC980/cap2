import java.util.Scanner;

public class Ejercicio1
{

    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {

            int num1,num2;
            int mayor=0;
                System.out.println("Inserte un número: ");
                num1 = sc.nextInt();
                System.out.println("Inserte un número: ");
                num2 = sc.nextInt();
                if(num1>num2)
                {
                    mayor=num1;
                    System.out.println("El valor mayor es "+mayor);
                }
                if(num1<num2)
                {
                    mayor=num2;
                    System.out.println("El valor mayor es "+mayor);
                    
                }
                if(num1==num2)
                {
                    System.out.println("Estos numeros son iguales.");
                }
        }

    }
}