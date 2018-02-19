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
public class Harmonica implements IInstrument {
    // Methods
    public String play() {
        return "dap dap";
    }
    
    public int getSoundVolume() {
        return 0;
    }
    
   public String getColor() {
       return "incolore";
   }
    
}
