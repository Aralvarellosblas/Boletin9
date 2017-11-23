package ejercicio9_5;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Fibonacci{

    Scanner sc=new Scanner(System.in);
    int numero, fibo1, fibo2, i;

    public void serieFib(){
        do{
            System.out.print("Introduce numero de elementos de la secuencia debe ser mayor que 1: ");
            numero=sc.nextInt();
        } while(numero <= 1);
        System.out.println("Los " + numero + " primeros términos de la serie de Fibonacci son:");

        fibo1=1;
        fibo2=1;

        System.out.print(fibo1 + " ");
        for(i=2; i <= numero; i++){
            System.out.print(fibo2 + " ");
            fibo2=fibo1 + fibo2;
            fibo1=fibo2 - fibo1;
        }
        System.out.println();
    }
}
