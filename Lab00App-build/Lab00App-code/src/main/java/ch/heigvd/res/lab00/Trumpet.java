/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author fch093257
 */
public class Trumpet implements IInstrument {
    // Methods
    public String getColor() {
        return "golden";
    }
    
    public String play() {
        return "pouet";
    }
    
    public int getSoundVolume() {
        return 1;
    }
    
}
