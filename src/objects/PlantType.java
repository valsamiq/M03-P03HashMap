/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author daw2
 */
public class PlantType extends Pokemon{
    private String hab;

    public PlantType(String hab, String name, int atk, int def, int hp) {
        super(name, atk, def, hp);
        this.hab = hab;
    }

    public String getHab() {
        return hab;
    }

    public void setHab(String hab) {
        this.hab = hab;
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
