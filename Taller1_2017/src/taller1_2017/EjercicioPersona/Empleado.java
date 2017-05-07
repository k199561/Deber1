/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1_2017.EjercicioPersona;

import java.util.Date;

/**
 *
 * @author Macias Lopez
 */
public class Empleado extends Persona{
    private double salario = 0;
    private Date fechaEntrada;
    public Empleado(String nombre, String direccion, String telefono, String email) {
        super(nombre, direccion, telefono, email);
    }
    
}
