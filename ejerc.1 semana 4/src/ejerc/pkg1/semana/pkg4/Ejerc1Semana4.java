/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerc.pkg1.semana.pkg4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class Ejerc1Semana4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int grupo;
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        
List<Integer> numbers = new ArrayList<>(5);
for (int i=1;i<3;i++){
   numbers.add(i);
}
Random random = new Random();
while (numbers.size()>1){
    int randomIndex = random.nextInt(numbers.size());
    


  
   System.out.println("D anoto: "+ numbers.get(randomIndex) + " goles contra C");
   System.out.println("A anoto:" + numbers.get(randomIndex) + " goles contra B");
  
   numbers.remove(randomIndex);
   
      
        
       
}
       
        
    }
    
}
