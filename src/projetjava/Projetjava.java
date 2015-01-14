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
public class Projetjava {
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
     // premiere fonction devantlaboite  
        
        
        
        
        Scanner sc = new Scanner(System.in);
        client newclient = new client();
        
        newclient.CaractClient();
        
        Bouncer momo = new Bouncer(2);
        int humeurdeMOMO = momo.getHumeur();// humeur de momo = 2
        momo.setHumeur(3);
        humeurdeMOMO = momo.getHumeur();// humeur de momo = 3
        
       }
        
       
        
        
        
        
    }

