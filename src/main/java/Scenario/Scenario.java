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
public class Scenario {
    
    public static void main(String[] args) {
        new Scenario().demonstration();
    }
    public void demonstration(){
        Bandeau bandeau = new Bandeau();
        Zoom zm = new Zoom(10,"Zoom *10",bandeau,2);
        zm.effctuerEffet();
        ChangementCouleurTexte cct = new ChangementCouleurTexte(Color.RED,"On passe au rouge",bandeau,1);
        cct.effctuerEffet();
        ChangementCouleurFond ccf = new ChangementCouleurFond(Color.BLACK,"sur fond noir",bandeau,1);
        ccf.effctuerEffet();
    }
}
