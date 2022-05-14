
package org.prodesa.condicionales;

import java.util.Scanner;

/*
        
        MENU BASICO
        
        
        
        CARGA DE UNA OPCION CON POSIBILIDADES
        
        SALIDA POR PANTALLA QUE MUESTRE 
        4 OPCIONES
        
        
        1-CARGA
        2-VISUALIZACION
        3-MODICACION
        4-SALIR
        
        LUEGO DE ESO QUE LA PERSONA SELCCIONA UNA OPCION SOLO INDICAMOS POR PANTALLA 
        SE REALIZO Y LA OPCION ELEGIDA
        
        EJEMPLO
        
        1 - CARGA
        
        SE REALIZO LA CARGA
        
        EN EL CASO DE QUE LA PERSONA SE EQUIVOQUE SE DEBE ENVIAR EL MENSAJE DICIENDO 
        ERROR DE EJECUCION INGRESE VALOR ENTRE 1 y 4
        
        
        
        
        
        */
public class UsoSwitch {
     public static void main(String[] args) {
        
       int op = seleccionarOpcion("Seleccione una opción: 1=CARGAR, 2=VISUALIZACION, 3=MODIFICACION, 4=SALIR");
       
      switch (op){
          case 1:
              System.out.println("Se realizo la carga");
              break;
              
          case 2:
              System.out.println("Se realizo la Visualizacion");
              break;
          case 3:
              System.out.println("Se realizo la Modificacion");
              break;
              
          case 4:
              System.out.println("Se realizo la Salida");
              break;
           
              default:
                  System.out.println("Seleccion incorrecta, ingrese un valor entre 1 y 4");
      } 
    }
     
      public static int seleccionarOpcion(String texto){
    
        
        Scanner sn= new Scanner(System.in);
        System.out.println(texto);
        int opcion=sn.nextInt();
        
        return opcion;
   }
    
}
