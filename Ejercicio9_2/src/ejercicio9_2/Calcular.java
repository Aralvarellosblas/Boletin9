package ejercicio9_2;
/*
 * @author Arturo
 */
public class Calcular {
    private int num=10;
    private double suma=0, producto=1;

    public Calcular() {
    }
    
    public void calcSum(){
        while(num<91){
            suma=suma+num;
            num++;            
        }
        System.out.println("La suma Total es: "+suma);
    }
    public void calcProd(){
        for(num=10;num<91;num++){
            producto=producto*num;
        }
        System.out.println("El producto total es: "+producto);
    }
}
