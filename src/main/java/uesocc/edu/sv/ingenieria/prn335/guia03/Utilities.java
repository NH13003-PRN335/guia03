
package uesocc.edu.sv.ingenieria.prn335.guia03;

import java.io.Serializable;
import javax.ejb.LocalBean;
import javax.enterprise.context.Dependent;

@LocalBean
@Dependent
public class Utilities implements Serializable  {
    
   
    
    public  String getResume(String texto){
        String frase="";
        if(texto.length()>=20){
            frase=frase+texto.substring(0,20);
        }else{
            frase=frase+texto;
        }
        return frase;
    }
    
    public  String capitalizar(String texto){
        if(texto.equals("")){
        
        return texto;
        }
       
        else{
            if(texto.equals(null)){
                
            return null;
            
            }
            String nuevacadena="";
       for(String palabra : texto.split(" ")){
          nuevacadena +=palabra.substring(0,1).toUpperCase()+palabra.substring(1,palabra.length()).toLowerCase()+" ";
       }
       nuevacadena = nuevacadena.trim();
       texto=nuevacadena;
            return texto;
        }
    }
    
     public  int contarCoincidencias(String frase, String texto) {
        int contador = 0;
        
        
        while (texto.indexOf(frase) > -1) {
            texto= texto.substring(texto.indexOf(frase) + frase.length(), texto.length());
            contador++;
        }
        
        
        return contador;
    }
    
    
    
    
}
