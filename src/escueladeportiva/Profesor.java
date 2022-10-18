/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escueladeportiva;

/**
 *
 * @author RYZEN 5
 */
public class Profesor extends Persona{
    
    private String especialidad;
    private double salario;

    public Profesor(String especialidad, double salario) {
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public Profesor(String especialidad, double salario, String numDocumento, String nombre, String apellido, String direccion, String telefono, String genero, String fechaNacimiento) {
        super(numDocumento, nombre, apellido, direccion, telefono, genero, fechaNacimiento);
        this.especialidad = especialidad;
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
