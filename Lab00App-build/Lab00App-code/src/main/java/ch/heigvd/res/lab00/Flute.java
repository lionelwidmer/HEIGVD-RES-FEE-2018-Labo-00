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
public class Flute implements IInstrument {
    // Methods
    public String sound() {
        return "sound";
    }
    
    public String getColor() {
        return "color";
    }
    
    public String play() {
        return "play";
    }
    
    public int getSoundVolume() {
        return 0;
    }
}
