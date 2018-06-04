/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.pkg1;

import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class Ejerc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        int total = 0;
        int cont = 0;
        int promedio;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = sc.nextInt();
        total = numero + total;
        
        while (numero != 0) {
            System.out.println("Ingrese un numero");
            numero = sc.nextInt();
            total = numero + total;
            cont = cont + 1;
           
        }
        
        promedio = total / cont;
        System.out.println("El promedio es de: " + promedio);
    }
    
}
