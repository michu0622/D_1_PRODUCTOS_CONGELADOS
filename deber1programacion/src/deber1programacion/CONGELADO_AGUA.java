/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1programacion;


  public class CONGELADO_AGUA extends PRODUCTOCONGELADO{
    String cantidad_sal;

           
    public CONGELADO_AGUA (String nombre,String fecha_envasado,String fecha_caducidad,String numero_lote,String pais,String cantidad_sal){
        super(nombre,fecha_envasado,fecha_caducidad,numero_lote,pais);
        this.cantidad_sal=cantidad_sal;
                
    }
    public String mostrartodocongeladoporagua (){
            return super.MostrarproductoCongelado()+" \nCANTIDAD DE SAL EN EL AGUA .-"+cantidad_sal+" EN GRAMOS POR LITROS DE AGUA";
    }
 }
