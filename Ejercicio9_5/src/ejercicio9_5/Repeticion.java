package ejercicio9_5;

import java.util.Scanner;

/*
 * @author Arturo
 */
public class Repeticion{

    private int num, selec, i=0, x, y, z;
    Scanner sc=new Scanner(System.in);

    public Repeticion(){

    }

    public void secuencia(){
        System.out.println("Selecciona una secuencia\n1- (2 4 6 8 10...)\n2- (- 1 + 2 – 3 + 4 – 5 + 6...)\n3- Fibonacci");
        selec=sc.nextInt();
        switch(selec){
            case 1:
                System.out.println("Seleciona el numero de elementos de la secuencia");
                x=0;
                y=sc.nextInt();
                System.out.println("Inicio secuencia");
                while(i < y){
                    num=x + 2;
                    i++;
                    x=x + 2;
                    System.out.print(num + " ");
                }
                System.out.println();
                break;
            case 2:
                System.out.println("Seleciona el numero de elementos de la secuencia");
                x=1;
                z=1;
                y=sc.nextInt();
                System.out.println("Inicio secuencia");
                do{
                    num=x;
                    i++;
                    x++;
                    if(num % 2 == 0){
                        System.out.print("+" + num + " ");
                    }
                    else{
                        System.out.print("-" + num + " ");
                    }
                } while(i < y);
                System.out.println();
                break;
            case 3:
                Fibonacci f=new Fibonacci();
                f.serieFib();
                break;
            default:
                System.out.println("Seleccion incorrecta");
        }

    }
}
