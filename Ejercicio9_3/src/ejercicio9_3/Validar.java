package ejercicio9_3;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Validar {
    Scanner sc=new Scanner(System.in);
    public float x1, x2;

    public Validar() {
    }
    
    public void val(float x1, float x2){
        if(x1>0&&x2>0){
            Rectangulo r1=new Rectangulo(x1,x2);
            r1.calculoArea();
        }
        else System.out.println("Los valores no pueden ser negarivos");
            
    }
    
}
