/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author USER
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int juan=70;
      int amigoJuan=150;
      
      while(juan!=amigoJuan){
         juan++;
         amigoJuan--;
        System.out.println("Juan Km: "+ juan); 
        System.out.println("amigo de Juan Km: "+ amigoJuan); 
         
      }
      System.out.println("Juan se encuentra con su amigo en el Km: "+ juan); 
      
      
    }
    
}
