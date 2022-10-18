/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escueladeportiva;

import escueladeportiva.Categoria;
import escueladeportiva.Persona;

/**
 *
 * @author RYZEN 5
 */
public class Alumno extends Persona{

    private Categoria categoria;
    private Aseguradora seguro;

    public Alumno(Categoria categoria, Aseguradora seguro) {
        this.categoria = categoria;
        this.seguro = seguro;
    }

    public Alumno(Categoria categoria, Aseguradora seguro, String numDocumento, String nombre, String apellido, String direccion, String telefono, String genero, String fechaNacimiento) {
        super(numDocumento, nombre, apellido, direccion, telefono, genero, fechaNacimiento);
        this.categoria = categoria;
        this.seguro = seguro;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Aseguradora getSeguro() {
        return seguro;
    }

    public void setSeguro(Aseguradora seguro) {
        this.seguro = seguro;
    }
    
    public void hallarCategoria(){
        
    }
    
}
