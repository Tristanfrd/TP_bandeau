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
public class Scenario {
    
    public static void main(String[] args) {
        new Scenario().demonstration();
    }
    public void demonstration(){
        Bandeau bandeau = new Bandeau();
        Zoom zm = new Zoom(50,"Zoom *50",bandeau);
        zm.effctuerEffet();
        
    }
}
