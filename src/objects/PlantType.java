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
        int min=0, max=50;
        int tmp =((int)(Math.random()*(min-max+1))+min) + getAtk();        
        if(tmp > getHp()){
            return true;
        }
        else{
            return false;
        }
    }
    
//   (\_(\
// =( °w° )=
//   )   ( //
//  (__ __)/
// balsamiq   

}
