package ejercicio9_3;
/*
 * @author Arturo
 */
public class Rectangulo {
    private float base, altura, area;
    

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }
    public void calculoArea(){
        area=base*altura;
        System.out.println("El área es de: "+area+" m2");
    }
    
    
}
