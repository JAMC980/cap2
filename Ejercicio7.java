import java.util.Scanner;

public class Ejercicio7 
{
    public static void main(String[] args) 
    {
        int resto;
        int num1,num2;
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Introduzca el primer entero:");
            num1 = sc.nextInt();
            System.out.println("Introduzca el segundo entero:");
            num2 = sc.nextInt();

            resto = num1%num2;
    
            if (resto==0)
            System.out.println(num1 + " es múltiplo de " + num2);
            else
            System.out.println(num1 + " NO es múltiplo de " + num2);
        } 
    }   
    
}