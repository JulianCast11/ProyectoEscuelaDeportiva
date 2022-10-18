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
public class Auxiliar extends Persona{
    
    private int edad;
    private double salario;

    public Auxiliar(int edad, double salario) {
        this.edad = edad;
        this.salario = salario;
    }

    public Auxiliar(int edad, double salario, String numDocumento, String nombre, String apellido, String direccion, String telefono, String genero, String fechaNacimiento) {
        super(numDocumento, nombre, apellido, direccion, telefono, genero, fechaNacimiento);
        this.edad = edad;
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void validarCondiciones(){
        
    }
    
}
