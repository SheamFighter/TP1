/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde.java;

import java.util.Random;

/**
 *
 * @author csnd2350
 */
public class De {
    private static int CPT_DE = 0;
    private int numero;
    private int nbFaces;
    private int valeur;
    private boolean pipe;
    
    public De() {
        this.CPT_DE++;
        this.numero = CPT_DE;
        this.nbFaces = 6;
        this.valeur = 0;
    }

    De(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumero() {
        return numero;
    }

    public int getNbFaces() {
        return nbFaces;
    }

    public int getValeur() {
        return valeur;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNbFaces(int nbFaces) {
        this.nbFaces = nbFaces;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    
    void lancer(){
        Random r = new Random();
        if(!this.pipe){
            this.valeur = r.nextInt(this.nbFaces) + 1 ;
        } else {
            int [] valeurs = {1 , 2, 4};
            this.valeur = valeurs[r.nextInt(valeurs.length)];
        }
    }
    
    void pipe() {
        this.pipe = true;
    }

    @Override
    public String toString() {
        return "De{" + "numero" + numero + ", nbFaces" + nbFaces + ",valeur=" + valeur +'}';
    }
    
    
}

