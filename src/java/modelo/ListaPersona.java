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
public class ListaPersona {
    static List usuario;
	
    public ListaPersona() {
        
	if(usuario==null)
            usuario= new ArrayList();
	}
	
	public void agrega(Persona persona){
		usuario.add(persona);
	}
	
	public String[][] mostrar() {
            String[][] datos = new String [usuario.size()][3];
		
            int cont=0; 
		
            for (Object object : usuario) {
            Persona persona = (Persona)object;
			
            datos[cont][0] = persona.getNombres();
            datos[cont][1] = persona.getApellidos();
            datos[cont][2] = persona.getHora();  
            cont++;
			
           }
	return datos;
	}
    
}
