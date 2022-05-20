/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejer_03_02;

/**
 *
 * @author PC
 */
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
