/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1programacion;

public class PRODUCTOREFRIGERADO  extends PRODUCTO{
    
     String temperatura_recomendada;
    
    public PRODUCTOREFRIGERADO (String nombre,String fecha_envasado,String fecha_caducidad,String numero_lote,String pais,String temperatura_recomendada){
        super(nombre,fecha_envasado,fecha_caducidad,numero_lote,pais);
        this.temperatura_recomendada=temperatura_recomendada;
        
    }
    public String mostrartodo (){
            return super.Mostrarproducto()+" \nLA TEMPERATURA DE MANTENIMIENTO RECOMENDADA ES .-"+temperatura_recomendada;
    }
    
}
