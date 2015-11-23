/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1programacion;

public class PRODUCTOFRESCOS extends PRODUCTO{
   
    public PRODUCTOFRESCOS (String nombre,String fecha_envasado,String fecha_caducidad,String numero_lote,String pais){
        super(nombre,fecha_envasado,fecha_caducidad,numero_lote,pais);
        
               
    }
    public String mostrartodo (){
        return super.Mostrarproducto();
    }
    
}