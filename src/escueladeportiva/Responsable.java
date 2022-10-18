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
public class Responsable extends Persona{
    
    private String email;

    public Responsable(String email) {
        this.email = email;
    }

    public Responsable(String email, String numDocumento, String nombre, String apellido, String direccion, String telefono, String genero, String fechaNacimiento) {
        super(numDocumento, nombre, apellido, direccion, telefono, genero, fechaNacimiento);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
}
