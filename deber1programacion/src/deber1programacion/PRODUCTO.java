/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1programacion;

public class PRODUCTO {
    String nombre;
    String fecha_envasado;
    String fecha_caducidad;
    String numero_lote;
    String pais;
    
    
     public PRODUCTO (String nombre,String fecha_envasado,String fecha_caducidad,String numero_lote,String pais){
        this.nombre=nombre;
        this.fecha_envasado=fecha_envasado;
        this.fecha_caducidad=fecha_caducidad;
        this.numero_lote=numero_lote;
        this.pais=pais;
      
        
    }
    public String Mostrarproducto(){
       return "EL NOMBRE DEL PRODUCTO ES.- "+nombre+ " \nLA FECHA DE ENVASADO ES .-"+fecha_envasado+ " \nLA FECHA DE CADUCIDAD ES .-"+fecha_caducidad+ " \nEL NUMERO LOTE ES .-"+numero_lote+ " \nEL PAIS DE ORIGEN DEL PRODUCTO ES .-"+pais;
    }
    
}
