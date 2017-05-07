
package taller1_2017;

import javax.swing.JOptionPane;


public class Rectangulo {
    
    private double ancho = 1, altura= 1;

    public Rectangulo() {
        this.setAltura(altura);
        this.setAncho(ancho);
    }
    public  Rectangulo(double altura, double  ancho){
        this.setAltura(altura);
        this.setAncho(ancho);
    }
    
    public double getArea(){
        double area=0;
        area = getAncho() * getAltura();
        return area;
    }
    
    public double getPerimetro(){
        double perimetro=0;
        perimetro = 2 *(getAncho() + getAltura());
        return perimetro;
    }
    
    public double getAncho() {
        return ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(2, 3);
        System.out.println( "El area del Rectangulo1 es: " + rectangulo1.getArea());
        System.out.println( "El perimetro del Rectangulo1 es: " + rectangulo1.getPerimetro());
        
    }
    
}
