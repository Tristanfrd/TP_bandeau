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
public class ChangementCouleurFond extends Effet{

    private Color couleur;

    public ChangementCouleurFond(Color couleur, String nom, Bandeau b) {
        super(nom, b);
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
        return "ChangementCouleurFond{" + "couleur=" + couleur + '}';
    }

    
    
    @Override
    public void effctuerEffet() {
        getBandeau().setMessage(getNom());
        getBandeau().setBackground(couleur);
        getBandeau().sleep(1000);
    }
    
}
