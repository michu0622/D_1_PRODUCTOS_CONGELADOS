/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1programacion;

public class CONGELADO_NITROGENO extends PRODUCTOCONGELADO{
    String metodo_congelamiento;
    String tiempo_exposicion;
//deben llevar el metodo de congelacion y el tiempo de exposion al nitrogeno expresado segundos.
           
    public CONGELADO_NITROGENO (String nombre,String fecha_envasado,String fecha_caducidad,String numero_lote,String pais,String metodo_congelamiento,String tiempo_exposicion){
        super(nombre,fecha_envasado,fecha_caducidad,numero_lote,pais);
        this.metodo_congelamiento=metodo_congelamiento;
        this.tiempo_exposicion=tiempo_exposicion;
                
    }
    public String mostrartodocongeladopornitrogeno (){
            return super.MostrarproductoCongelado()+" \nEL METODO DE CONGELAMIENTO FUE .-"+metodo_congelamiento+" \nTIEMPO DE EXPOSICION AL NITROGENO .-"+tiempo_exposicion+" SEGUNDOS";
    }
    
    
    
}
