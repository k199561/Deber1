/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1_2017.Ejercicio_Triangulo;

/**
 *
 * @author Macias Lopez
 */
public class Triangulo  extends ObjetoGeometrico{

    public Triangulo(Double lado1, Double lado2, Double lado3,Double base,Double altura) {
        super(lado1, lado2, lado3,base,altura);
    }
    
    /**
     *
     * @return
     */
    
    public double getArea(){
        Double area;
        area = (getBase()*getAltura()) / 2;
        return area;
    }
    public double getPerimetro(){
        double perimetro;
        perimetro=getLado1()+ getLado2()+getLado3();
        return perimetro;
    }
    public static void main(String[] args) {
        ObjetoGeometrico t1 = new Triangulo(5.0, 5.0, 5.0, 5.0, 5.0);
        System.out.println("el perimetro es "+ t1.getPerimetro() );
        System.out.println("el area es "+ t1.getArea());
    }
    
     
       
}
