package ejercicio9_6;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Sueldos {
    Scanner sc=new Scanner(System.in);
    private double sueldo;
    private float porcentaje;
    private float total1=0, total2=0, total3=0;
    
    public void comparar(){
        System.out.println("Introduce sueldo del trabajador");
        do{
            sueldo=sc.nextInt();
            if(sueldo>0){
                if(sueldo>=1000&&sueldo<=1750) total1=total1+1;
                else if (sueldo>0&&sueldo<1000) total2=total2+1;
                else total3=total3+1;
            }
            else System.out.println("El sueldo no puede ser negativo");
        }while(sueldo!=0);
        porcentaje=((total2/(total1+total2+total3))*100);
        System.out.println("Trabajadores que ganan entre 1000 y 1750€: "+total1);
        System.out.println("Porcentaje de trabajadores con sueldo inferior a 1000€: "+porcentaje+" %");
        System.out.println("Trabajadores con sueldo superior a 1750€: "+total3);
        System.out.println(total1);
        System.out.println(total2);
        System.out.println(total3);
    }
}
