/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller1_2017.EjercicioPersona;

/**
 *
 * @author Macias Lopez
 */
public class Estudante extends Persona{
    Estatus estatus = new Estatus();
    public Estudante(String nombre, String direccion, String telefono, String email) {
        super(nombre, direccion, telefono, email);
    }
    
}
