/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escueladeportiva;

import escueladeportiva.Persona;

/**
 *
  * @author RYZEN 5
 */
public class Administradora extends Persona{
    
    private double salario;

    public Administradora(double salario) {
        this.salario = salario;
    }

    public Administradora(double salario, String numDocumento, String nombre, String apellido, String direccion, String telefono, String genero, String fechaNacimiento) {
        super(numDocumento, nombre, apellido, direccion, telefono, genero, fechaNacimiento);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
