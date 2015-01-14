/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;
import projetjava.client;
/**
 *
 * @author isen
 */
public class Videur  {
    
    public int humeur;
    
    public void Checker(){
        
        System.out.println( "Videur:  Vas-y gros, passes une bonne soirée"); 
        
      SeDéplacer();
        
    }
    
   
    
    public void Virer(){
     
        System.out.println("Videur: Pas possible pour vous");
        
    ArriverDevantLaBoite();
    }
    
    
    
    public int getHumeur(){
    return this.humeur;
    }
}
    
    
 public void Entrer(){
    System.out.println ("entrez");
    SeDéplacer();
}

}