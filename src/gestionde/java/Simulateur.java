/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde.java;

/**
 *
 * @author csnd2350
 */
public class Simulateur {
    private int [][] valeurs;
    private De de;
    private int totalJoueur;
    private int nbLancers;

    public void setTotalJoueur(int totalJoueur) {
        this.totalJoueur = totalJoueur;
    }

    public void setNbLancers(int nbLancers) {
        this.nbLancers = nbLancers;
    }

    public int getTotalJoueur() {
        return totalJoueur;
    }

    public int getNbLancers() {
        return nbLancers;
    }
    
    
    public Simulateur(){
        this.de = new De();
        this.valeurs = new int[11][20];
        for(int indJoueurs=0; indJoueurs<valeurs.length;indJoueurs++){
            for(int indLancer=0; indLancer<this.valeurs[indJoueurs].length; indLancer++){
                valeurs[indJoueurs][indLancer] = 0;
            }
            
        }
    }
    
    
    public int nbLancers(int NbLan)
    {
        int resu = 0;
        int [] ligneJoueur = this.valeurs[NbLan];
        for(int lpt = 0; lpt < this.valeurs[NbLan].length; lpt++){
            if(this.valeurs[NbLan] [lpt] == 6)
            {
                resu = resu + 1;
            }
        }
        return resu;
    }
    public int totalJoueur(int numeroJoueur){
        int resultat = 0;
        int [] ligneJoueur = this.valeurs[numeroJoueur];
        for(int vpt = 0; vpt < this.valeurs[numeroJoueur].length; vpt++){
            resultat = resultat + this.valeurs[numeroJoueur] [vpt];
        }
        return resultat;
    }
    
    void afficheLancer(int numJoueur){
        int[] ligneJoueur = this.valeurs[numJoueur];
        for(int cpt =0; cpt<this.valeurs[numJoueur].length;cpt++){
            System.out.print(this.valeurs[numJoueur] [cpt] + " ");
        }
    }

    
    void remplir(){
        for(int indJoueurs=0; indJoueurs<valeurs.length;indJoueurs++){
            for(int indLancer=0; indLancer<this.valeurs[indJoueurs].length; indLancer++){
                this.de.lancer();
                valeurs[indJoueurs][indLancer] = this.de.getValeur();
            }
        }
    }
    
    @Override
    public String toString() {
        String res = "";
         for(int indJoueurs=0; indJoueurs<valeurs.length;indJoueurs++){
            for(int indLancer=0; indLancer<this.valeurs[indJoueurs].length; indLancer++){
                res += this.valeurs[indJoueurs][indLancer] +" ";
            }
            res += "\n";
        }
        return res;
    }
    
    
}
