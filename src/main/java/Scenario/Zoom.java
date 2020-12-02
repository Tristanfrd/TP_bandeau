/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scenario;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author frede
 */
public class Zoom extends Effet{

    private int grossisment;

    public Zoom(int grossisment, String nom, Bandeau b) {
        super(nom, b);
        this.grossisment = grossisment;
    }

    public int getGrossisment() {
        return grossisment;
    }

    public void setGrossisment(int grossisment) {
        this.grossisment = grossisment;
    }

    @Override
    public String toString() {
        return "Zoom{" + "grossisment=" + grossisment + '}';
    }
    
    
    @Override
    public void effctuerEffet() {
        for (int i = 1; i < 1*grossisment ; i+=1) {
            getBandeau().setMessage(getNom());
            getBandeau().setFont(new Font("Dialog", Font.BOLD, 1+i));
            getBandeau().sleep(100);
	}
    }
    
}
