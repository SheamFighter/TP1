/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde.java;
import view.Jeu421Window;

/**
 *
 * @author csnd2350
 */
public class Main {
    public static void main(String[] args){
       De d1 = new De();
       De d2 = new De();
       De d3 = new De();
       
        d1.pipe();
        d2.pipe();
        d3.pipe();
        
        d1.lancer();
        d2.lancer();
        d3.lancer();
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        
 //       Simulateur sim = new Simulateur();
        
 //       System.out.println("Après Construction");
 //       System.out.println(sim);
 //       System.out.println("Après remplissage");
 //       System.out.println(sim);
          Jeu421Window F1 = new Jeu421Window();
          F1.setVisible(true);
    }
}
