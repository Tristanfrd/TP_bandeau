/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scenario;
import bandeau.Bandeau;
import java.awt.Color;
/**
 *
 * @author frede
 */
public class ChangementCouleurTexte extends Effet {
    
    private Color couleur;

    public ChangementCouleurTexte(Color couleur, String nom, Bandeau b,int r) {
        super(nom, b,r);
        this.couleur = couleur;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "ChangementCouleurTexte{" + "couleur=" + couleur + '}';
    }

    @Override
    public void effctuerEffet() {
        for (int i =0;i<super.getRepetition();i++){
            getBandeau().setMessage(getNom()+" repetition n°"+i+1);
            getBandeau().setForeground(couleur);
            getBandeau().sleep(1000);
    }
        getBandeau().sleep(1000);   
    }  
}
