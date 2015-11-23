/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber1programacion;
public class DEBER1PROGRAMACION {

    public static void main(String[] args) {
      System.out.println("****************************************************************");
      System.out.println("                   PRODUCTOS FRESCOS");
      PRODUCTOFRESCOS pf1 = new PRODUCTOFRESCOS("ATUN","12-NOV-2015","15-NOV-2016","12334","ECUADOR");
      System.out.println(pf1.mostrartodo());
      System.out.println();
      PRODUCTOFRESCOS pf2 = new PRODUCTOFRESCOS("CAMARON","20-NOV-2015","15-NOV-2018","231561886","ECUADOR");
      System.out.println(pf2.mostrartodo());
      System.out.println("****************************************************************");
      System.out.println("                   PRODUCTOS REFRIGERADOS");
      PRODUCTOREFRIGERADO pr1 = new PRODUCTOREFRIGERADO("ATUN","12-NOV-2015","15-NOV-2016","12334","ECUADOR","34º");
      System.out.println(pr1.mostrartodo());
      System.out.println("****************************************************************");
      System.out.println("                PRODUCTOS CONGELADOS POR AIRE");
      CONGELADO_AIRE pca1 = new CONGELADO_AIRE("ATUN","12-NOV-2015","15-NOV-2016","12334","ECUADOR","34º","4","2","3");
      System.out.println(pca1.mostrartodocongeladoporaire());
      System.out.println("****************************************************************");
      System.out.println("                PRODUCTOS CONGELADOS POR AGUA");
      CONGELADO_AGUA pcagua1 = new CONGELADO_AGUA("ATUN","12-NOV-2015","15-NOV-2016","12334","ECUADOR","34º");
      System.out.println(pcagua1.mostrartodocongeladoporagua());
      System.out.println("****************************************************************");
      System.out.println("             PRODUCTOS CONGELADOS POR NITROGENO");
      CONGELADO_NITROGENO pcn1 = new CONGELADO_NITROGENO("ATUN","12-NOV-2015","15-NOV-2016","12334","ECUADOR","wfgwgw","45");
      System.out.println(pcn1.mostrartodocongeladopornitrogeno());
    }
    
}
