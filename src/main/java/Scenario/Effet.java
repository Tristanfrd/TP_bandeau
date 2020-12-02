/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scenario;

import bandeau.Bandeau;

/**
 *
 * @author frede
 */
public abstract class Effet {
    
    private String nom;
    private Bandeau bandeau;
    private int repetition;

    public Effet(String nom,Bandeau b,int r) {
        this.nom = nom;
        this.bandeau=b;
        this.repetition=r;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Bandeau getBandeau() {
        return bandeau;
    }

    public void setBandeau(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public int getRepetition() {
        return repetition;
    }

    public void setRepetition(int repetition) {
        this.repetition = repetition;
    }

    @Override
    public String toString() {
        return "Effet{" + "nom=" + nom + ", bandeau=" + bandeau + ", repetition=" + repetition + '}';
    }

    public abstract void effctuerEffet();
}
