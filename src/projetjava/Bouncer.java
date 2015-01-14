/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;

/**
 *
 * @author isen
 */
public class Bouncer {
   
    
    public int humeur;
    
    
    public Bouncer(){
    
    }
    
    public Bouncer(int humeur1){
    this.humeur = humeur1;
    }
    
    
    public void checker(){
        
        System.out.println( "Videur:  Vas-y gros, passes une bonne soirée"); 
        
    //  seDéplacer();
        
    }
    
   
    
    public void virer(){
     
        System.out.println("Videur: Pas possible pour vous");
        
    ArriverDevantLaBoite();
    }
    
    
    
    public int getHumeur(){
    return this.humeur;
    }
    
    public void setHumeur(int newHumeur){
    this.humeur = newHumeur ;
    }
    
    
 public void Entrer(){
    System.out.println ("entrez");
    SeDéplacer();
}

}
}
