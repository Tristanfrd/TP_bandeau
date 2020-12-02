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
public class Rotation extends Effet {
    
    private int rotation;

    public Rotation(int rotation, String nom, Bandeau b, int r) {
        super(nom, b, r);
        this.rotation = rotation;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    @Override
    public String toString() {
        return "Rotation{" + "rotation=" + rotation + '}';
    }

  @Override
    public void effctuerEffet() {
        int a = 1;
        for (int j =1;j<=super.getRepetition();j++){
            for (int i = 0 ; i < 1*rotation ; i+=1) {
                getBandeau().setMessage(getNom()+" repetition n°"+j);
                getBandeau().setRotation(2*Math.PI*a / rotation);
		getBandeau().sleep(100);
                a += 1;
	}
       getBandeau().sleep(1000);
    }
    }
    
    
}
