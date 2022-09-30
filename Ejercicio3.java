import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {

            int num1,num2,num3;
            int suma,promedio;
            int producto;

            System.out.println("           Bienvenid@.");
            System.out.println("Este programa le permite ingresar 3 valores con los que automaticamente le dara la suma,producto,promedio,el mayor y el menor.");

                System.out.println("Inserte un número: ");
                num1 = sc.nextInt();
                System.out.println("Inserte un número: ");
                num2 = sc.nextInt();
                System.out.println("Inserte un número: ");
                num3 = sc.nextInt();
                
                if (num1 > num2) {
                    if (num1 > num3) {
                        System.out.println("El mayor es: " + num1);
                        System.out.println("El menor es: " + num3);                                          
                    } else {
                        System.out.println("El mayor es: " + num3);
                        System.out.println("El menor es: " + num1);     
                    }
                } else if (num2 > num3) {
                    System.out.println("El mayor es: " + num2);
                    System.out.println("El menor es: " + num1);
                } else {
                    System.out.println("El mayor es: " + num3);
                    System.out.println("El menor es: " + num1);
                }
                suma=num1+num2+num3;
                promedio=suma/3;
                producto=num1*num2*num3;

                System.out.println("La suma de los valores es:"+suma);
                System.out.println("El producto de los valores es:"+producto);
                System.out.println("El promedio de los valores es:"+promedio);
        }

    }
}
