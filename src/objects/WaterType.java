/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author balsamiq
 */
public class WaterType extends Pokemon {
    
    private String type;

    public WaterType(String type, String name, int atk, int def, int hp) {
        super(name, atk, def, hp);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean catchable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//   (\_(\
// =( °w° )=
//   )   ( //
//  (__ __)/
// balsamiq   

}
