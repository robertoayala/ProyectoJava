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
public class ListaIngreso {
    
    static List usuario;
	
    public ListaIngreso() {
        
	if(usuario==null)
            usuario= new ArrayList();
	}
	
	public void agrega(Ingreso ingreso){
		usuario.add(ingreso);
	}
	
	public String[][] mostrar() {
            String[][] datos = new String [usuario.size()][3];
		
            int cont=0; 
		
            for (Object object : usuario) {
            Ingreso ingreso = (Ingreso)object;
			
            datos[cont][0] = ingreso.getJugadas();
            datos[cont][1] = ingreso.getTotal();
            datos[cont][2] = ingreso.getHora();  
            cont++;
			
           }
	return datos;
	}
    
}
