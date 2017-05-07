/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1_2017;

import java.util.Date;
import javax.xml.crypto.Data;

/**
 *
 * @author Macias Lopez
 */
public class Cuenta {
    private int id = 0;
    private double saldo = 0;
    private double interes_anual = 0;
    private Date fechaDeCreacion ;

    public Cuenta(int id, double saldo, double interes_anual, Date fechaDeCreacion) {
        this.setId(id);
        this.setSaldo(saldo);
        this.setInteres_anual(interes_anual);
        this.setFechaDeCreacion(fechaDeCreacion);
    }
      public Cuenta() {
        this.setId(id);
        this.setSaldo(saldo);
        this.setInteres_anual(interes_anual);
        this.setFechaDeCreacion(fechaDeCreacion);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres_anual() {
        return interes_anual;
    }

    public void setInteres_anual(double interes_anual) {
        this.interes_anual = interes_anual;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }
    
    
    public double getInteresMensual(){
        double interesMensual = 0;
        interesMensual = getInteres_anual() / 12;
        return interesMensual;
    }
    
    public double getRetiro(Double valor){
        
        if(valor > getSaldo()){
            System.out.println("Saldo insuficiente");
        }else 
            setSaldo(getSaldo()- valor);
        
        return getSaldo();
    }
    
    public double getDeposito(double valor){
        
        setSaldo(getSaldo()+ valor);
        return getSaldo();
    }
    
    public static void main(String[] args) {
        Date fecha1 = new Date(2017, 5, 6);
        Cuenta cuenta1 = new Cuenta(001, 1000,20, fecha1);
        System.out.println("Su salo acutal es: "+ cuenta1.getRetiro(100.0));
        System.out.println("Su salo acutal es: "+ cuenta1.getDeposito(2000000.0));
        
        
        
    }
}
