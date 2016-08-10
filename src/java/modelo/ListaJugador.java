/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author robertoayala
 */
public class ListaJugador {
    
    static List usuario;
	
    public ListaJugador() {
        
	if(usuario==null)
            usuario= new ArrayList();
	}
	
	public void agrega(Jugador jugador){
		usuario.add(jugador);
	}
	
	public String[][] mostrar() {
            String[][] datos = new String [usuario.size()][3];
		
            int cont=0; 
		
            for (Object object : usuario) {
            Jugador jugador = (Jugador)object;
			
            datos[cont][0] = jugador.getNombres();
            datos[cont][1] = jugador.getCantidad();
            datos[cont][2] = jugador.getHora();  
            cont++;
			
           }
	return datos;
	}
    
}
