/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1programacion;

public class CONGELADO_AIRE extends PRODUCTOCONGELADO {
    
        
    String procentaje_nitrogeno;
    String procentaje_oxigeno;
    String procentaje_dioxidocarbono;
    String procentaje_vaporagua;
           
    public CONGELADO_AIRE (String nombre,String fecha_envasado,String fecha_caducidad,String numero_lote,String pais,String procentaje_nitrogeno,String procentaje_oxigeno,String procentaje_dioxidocarbono,String procentaje_vaporagua){
        super(nombre,fecha_envasado,fecha_caducidad,numero_lote,pais);
        this.procentaje_nitrogeno=procentaje_nitrogeno;
        this.procentaje_oxigeno=procentaje_oxigeno;
        this.procentaje_dioxidocarbono=procentaje_dioxidocarbono;
        this.procentaje_vaporagua=procentaje_vaporagua;
        
    }
    public String mostrartodocongeladoporaire (){
            return super.MostrarproductoCongelado()+" \nEL PORCENTAJE DE NITROGENO ES .-"+procentaje_nitrogeno+" \nEL PORCENTAJE DE OXIGENO ES .-"+procentaje_oxigeno+" \nEL PORCENTAJE DE DIOXIDO CARBONO ES .-"+procentaje_dioxidocarbono+" \nEL PORCENTAJE DEL VAPOR DE AGUA ES .-"+procentaje_vaporagua;
    }
    
}
