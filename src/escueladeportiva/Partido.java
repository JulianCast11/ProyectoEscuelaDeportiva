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
public class Partido {
 
    private String marcador;
    private String nameArbitro;
    private String horaPartido;
    private String equipoRival;
    private double valorArbitraje;

    public Partido(String marcador, String nameArbitro, String horaPartido, String equipoRival, double valorArbitraje) {
        this.marcador = marcador;
        this.nameArbitro = nameArbitro;
        this.horaPartido = horaPartido;
        this.equipoRival = equipoRival;
        this.valorArbitraje = valorArbitraje;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public String getNameArbitro() {
        return nameArbitro;
    }

    public void setNameArbitro(String nameArbitro) {
        this.nameArbitro = nameArbitro;
    }

    public String getHoraPartido() {
        return horaPartido;
    }

    public void setHoraPartido(String horaPartido) {
        this.horaPartido = horaPartido;
    }

    public String getEquipoRival() {
        return equipoRival;
    }

    public void setEquipoRival(String equipoRival) {
        this.equipoRival = equipoRival;
    }

    public double getValorArbitraje() {
        return valorArbitraje;
    }

    public void setValorArbitraje(double valorArbitraje) {
        this.valorArbitraje = valorArbitraje;
    }
    
    
    
}
