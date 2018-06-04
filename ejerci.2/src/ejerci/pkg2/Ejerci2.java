/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerci.pkg2;

import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class Ejerci2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numero;
        int x;
        boolean esPrimo = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = sc.nextInt();
        
        for (int i=2;i<=numero/2;i++){
            x=numero%i;
            if (x==0){
                esPrimo=false;
                
            }
        }
        if (esPrimo) {
            System.out.println("El numero " + numero + ", es primo");
            
        }else{
            System.out.println("El numero " + numero + ", no es primo");
        }
        
    }
    
}
