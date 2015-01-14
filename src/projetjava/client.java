/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjava;
import java.util.Scanner;

/**
 *
 * @author isen
 */
public class client {
    
    
    public String etat;
    public int age;
    public int sexe;
   public int budget; 
    
    
    Scanner sc = new Scanner(System.in);
    
    
    
    public void CaractClient(){
        
        
        
        System.out.println("Quel age avez-vous?");     
        int ages= sc.nextInt();
        
        /// faire le cas ou la personne ne met pas un entier
        
        System.out.println("Etes vous : \n 1- Un homme \n 2- Une femme");
        int sexes = sc.nextInt();
        
        ArriverDevantLaBoite();
        
        this.age= ages;
        this.sexe= sexes;
        
        // mettre le cas ou la personne a repondu et envoyer vers arriver devant la boite
       // dans le default mettre le cas ou la personne ne met pas la bonne reponse   
            
        }
    
    
    
     public void ArriverDevantLaBoite(){
         
         
         
         
        System.out.println("Vous êtes actuellement devant une boite de nuit, que voulez vous faire ? \n 1- Entrer dans la boite de nuit \n 2- Rester devant la boite \n 3- Quitter le simulateur");
       int choix= sc.nextInt();
          
           
           switch(choix){
               
               case 1:  
               SePrésenter();
                break;
               case 2: 
               ArriverDevantLaBoite();
               break;
               case 3:
               System.out.println(" Merci d'être venu à bientot");    
               break;
                   
               default: System.out.println("vous n'avez pas fait le bon numéro");
               ArriverDevantLaBoite();
                   
           }
           
           
     
     }
     
     
    
    public void SePrésenter() {
        
        // if avec l'age
       
        
        System.out.println("que voulez vous dire au videur? \n 1- Bonjour Monssieur  \n 2- Ouais non trop stylé je suis bourré je vais vomir  \n 3- Yo mon pote, ça va ? " );    
        int choixprésentation = sc.nextInt();
        
    
        // faire un switch et ne pas oublier le cas ou rien n'est bon
       
       while (this.age >=18)
           
          
       {
        switch (choixprésentation){
       
          case 1: 
             Entrer();
          break;
         case 2: 
             Virer();
          break;  
         case 3: 
             Checker(); 
          break  ;  
          default: 
              System.out.println("erreur : votre choix n'est pas bon!");
           
        }  
       
    }
        System.out.println("Vous n'avez pas l'age rentrer chez vous");
        CaractClient();
       
       
        
    }
    
    
 public void SeDéplacer(){
     
     System.out.println("Vous êtes dans la boite de nuit! Que voulez vous faire: \n 1- aller au bar \n 2- aller danser \n 3- "); 
     
     // aller au bar : commander budget, danser sur le bar: enerver le videur, voler un verre enerver le videur , jeu de la carte: budget
     
     // aller danser: danser comme un beau goss, danser comme un looser, draguer, renverser son verre 
     
     // 
 }
    
    
 }
    

 
    
    
    
    
    
    
    
