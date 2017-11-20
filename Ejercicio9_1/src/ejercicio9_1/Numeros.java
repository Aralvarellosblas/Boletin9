package ejercicio9_1;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Numeros {
    Scanner sc =new Scanner(System.in);
    private int n, x,totalp=0, totaln=0, total0=0;
    
    public void comparar(){
        System.out.println("Introduce una serie de 10 numeros Enteros");
        for(n=0;n<10;n++){
            x=sc.nextInt();
            if(x<0) totaln=totaln+1;
            else if (x==0) total0=total0+1;
            else totalp=totalp+1;
        }
        System.out.println("Total positivos: "+totalp);
        System.out.println("Total negativos: "+totaln);
        System.out.println("Total o: "+total0);
    }
    
}
