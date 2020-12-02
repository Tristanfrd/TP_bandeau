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

    public Effet(String nom,Bandeau b) {
        this.nom = nom;
        this.bandeau=b;
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

    @Override
    public String toString() {
        return "Effet{" + "nom=" + nom + ", bandeau=" + bandeau + '}';
    }

    public abstract void effctuerEffet();
}
