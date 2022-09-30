import java.util.Scanner;

public class ejercicio2{

    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {

            int num1,num2;
            int suma,diferencia,cociente;
            int producto;

            System.out.println("           Bienvenid@.");
            System.out.println("Este programa le permite ingresar 2 valores con los que automaticamente le dara la suma,producto, diferencia y cociente.");

                System.out.println("Inserte un número: ");
                num1 = sc.nextInt();
                System.out.println("Inserte un número: ");
                num2 = sc.nextInt();


                suma=num1+num2;

                producto=num1*num2;

                cociente=num1/num2;
             
             
                System.out.println("La suma de los valores es:"+suma);
                System.out.println("El producto de los valores es:"+producto);
                if(num1>num2)
                {
                    diferencia=num1-num2;
                    System.out.println("La diferencia de los valores es:"+diferencia);
                }
                if(num1<num2)
                {
                    diferencia=num2-num1;
                    System.out.println("La diferencia de los valores es:"+diferencia);
                    
                }
                System.out.println("El cociente de los valores es:"+cociente);

        }    
    }    
}