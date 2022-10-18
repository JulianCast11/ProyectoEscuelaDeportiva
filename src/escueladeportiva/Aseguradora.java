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
public class Aseguradora {
    
    private String num_Nit;
    private String razonSocial;
    private String direccion;
    private String telefono;

    public Aseguradora(String num_Nit, String razonSocial, String direccion, String telefono) {
        this.num_Nit = num_Nit;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNum_Nit() {
        return num_Nit;
    }

    public void setNum_Nit(String num_Nit) {
        this.num_Nit = num_Nit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void llamarAmbulancia(){
        
    }
    
}
