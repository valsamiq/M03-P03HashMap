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
public class FireType extends Pokemon {

    public FireType(String name, int atk, int def, int hp) {
        super(name, atk, def, hp);
    }

    @Override
    public boolean catchable() {
        int min=10,max=60;
        int tmp =((int)(Math.random()*(min-max+1))+min) + getHp();
        int antiCatch = getAtk()+getDef();
        if(tmp > antiCatch){
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
