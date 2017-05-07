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
public abstract class ObjetoGeometrico {
    private Double lado1 = 1.0, lado2 = 1.0, lado3 = 1.0, base = 1.0, altura=1.0;
    
    public ObjetoGeometrico(Double lado1, Double lado2, Double lado3 ,Double base,Double altura) {
        this.setLado1(lado1);
        this.setLado2(lado2);
        this.setLado3(lado3);
        this.setBase(base);
        this.setAltura(altura);
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public ObjetoGeometrico() {
        this.setLado1(lado1);
        this.setLado2(lado2);
        this.setLado3(lado3);
    }   
    
    
    public Double getLado1() {
        return lado1;
    }

    public void setLado1(Double lado1) {
        this.lado1 = lado1;
    }

    public Double getLado2() {
        return lado2;
    }

    public void setLado2(Double lado2) {
        this.lado2 = lado2;
    }

    public Double getLado3() {
        return lado3;
    }

    public void setLado3(Double lado3) {
        this.lado3 = lado3;
    }
    
    public abstract double getPerimetro();
    public abstract double getArea();
    
}
