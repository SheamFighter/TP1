/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde.java;

import java.util.Scanner;

/**
 *
 * @author csnd2350
 */
public class Jeu421 {
    private De D1;
    private De D2;
    private De D3;
    int nbCoups;
    private boolean t4;
    private boolean t2;
    private boolean t1;
    

    public void setD1(De D1) {
        this.D1 = D1;
    }

    public void setD2(De D2) {
        this.D2 = D2;
    }

    public void setD3(De D3) {
        this.D3 = D3;
    }

    public De getD1() {
        return D1;
    }

    public De getD2() {
        return D2;
    }

    public De getD3() {
        return D3;
    }
    
    public Jeu421(){
        this.D1 = new De(1);
        this.D2 = new De(2);
        this.D3 = new De(3);
        this.t4 = false;
        this.t2 = false;
        this.t1 = false;
        this.nbCoups = 0;
    }
    
    public void lancer(){
        this.D1.lancer();
        this.D2.lancer();
        this.D3.lancer();
        
        if(D1.getValeur() == 4 || D2.getValeur() == 4 || D3.getValeur() == 4)
            this.t4 = true;
        if(D1.getValeur() == 2 || D2.getValeur() == 2 || D3.getValeur() == 2)
            this.t2 = true;
        if(D1.getValeur() == 1 || D2.getValeur() == 1 || D3.getValeur() == 1)
            this.t1 = true;
        
        while(!this.t4 || !this.t2 || !this.t1){
            Scanner mc = new Scanner(System.in);
            System.out.println("Relance");
        }
        System.out.println("Gagné");
    }
    
    public void jouer(){
        
    }
    

    @Override
    public String toString() {
        return "Jeu421{" + "D1= " + D1 + ", D2= " + D2 + ", D3=" + D3 + "/n Vous avez gagné en " + nbCoups +" coups!"+ '}';
    }
    
}

