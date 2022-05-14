

package org.prodesa.condicionales;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class UsoIfAnidado {
    
    public static void main(String[] args) {
        
        int numero = cargarNumero ("ingrese la edad   ");
        
        if (numero ==18) {
            System.out.println("pasa y paga");
            
            
        } else {if (numero>18) {
            System.out.println("pasa GRATIS");
                
            } else {
            System.out.println("no pasa");
            }
        }
        
    }
    
     public static int cargarNumero(String texto){
    
        
        Scanner sn= new Scanner(System.in);
        System.out.println(texto);
        int numero=sn.nextInt();
        
        return numero;
   }
    
}
