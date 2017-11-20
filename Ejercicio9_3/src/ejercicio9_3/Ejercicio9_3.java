package ejercicio9_3;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Ejercicio9_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Validar val=new Validar();
        System.out.println("Introduce la base y la altura del rectangulo");
        val.val(sc.nextInt(),sc.nextInt());
    }

}
