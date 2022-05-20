
package com.mycompany.ejer_03_02;

public class Ejer_03_02 {

    public static void main(String[] args) {
       var ven1 = new Ventana1_INSCRIBETE(" ");
      ven1.setVisible(true);
        
      var ven2 = new Ventana2_DatosPesonales("                        DATOS PERSONALES");
      ven2.setVisible(true);
        
      var ven3 = new Ventana3_InfoCarrera("");
      ven3.setVisible(true);
      
      var ven4 = new Ventana4_CrearGrupo("CREAR GRUPO");
      ven4.setVisible(true);
       
      var ven5 = new Ventana5("");
      ven5.setVisible(true); 
    }
}
