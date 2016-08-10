/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author robertoayala
 */
public class Jugador {
    
    String nombres;
    String cantidad;
    String hora;
	
    public String getNombres() {
    return nombres;
    }
	
    public void setNombres(String nombres) {
    this.nombres = nombres;
    }
	
    public String getCantidad() {
    return cantidad;
    }
	
    public void setCantidad(String cantidad) {
    this.cantidad = cantidad;
    }
    
    public String getHora() {
    return hora;
    }
	
    public void setHora(String hora) {
    this.hora = hora;
    }
    
}
