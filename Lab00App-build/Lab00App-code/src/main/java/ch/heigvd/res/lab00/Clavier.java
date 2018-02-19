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
public class Clavier implements IInstrument {
    
    // Instance variables
    private int soundVolume;
    
    // Constructeur
    public Clavier() {
        this.soundVolume = 1;
        
    }
    
    public int getSoundVolume() {
        return this.soundVolume;
    }
    
    public String play()  {
        return "dayyyn";
    }
    
    public String getColor()  {
        return "ivory";
    }
    
}
