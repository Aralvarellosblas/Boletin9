package ejercicio9_4;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Tabla {
    private double x;
    Scanner sc=new Scanner(System.in);

    public Tabla() {
    }
    
    public void tablaMul(){
        do{
            System.out.println("Introduce un numero");
            x=sc.nextInt();
            System.out.println("1 * "+x+" = "+1*x+
                    "\n2 * "+x+" = "+2*x+
                    "\n3 * "+x+" = "+3*x+
                    "\n4 * "+x+" = "+4*x+
                    "\n5 * "+x+" = "+5*x+
                    "\n6 * "+x+" = "+6*x+
                    "\n7 * "+x+" = "+7*x+
                    "\n8 * "+x+" = "+8*x+
                    "\n9 * "+x+" = "+9*x+
                    "\n10 * "+x+" = "+10*x);
        }
        while(x!=0);
    }
}
