/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.pkg3;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ulacit
 */
public class Ejerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         String texto;
         System.out.println("Ingrese un texto");
         texto = sc.nextLine();
      
         StringTokenizer stringTokenizer = new StringTokenizer(texto);
         System.out.println("Cantidad de palabras: " + stringTokenizer.countTokens());
    }
    
}
