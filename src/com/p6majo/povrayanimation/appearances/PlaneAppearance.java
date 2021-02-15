package com.p6majo.povrayanimation.appearances;

import java.awt.*;

/**
 * The class PlaneAppearance
 *
 * @author com.p6majo
 * @version 2020-07-29
 */
public class PlaneAppearance extends Appearance {

    /*
     *********************************************
     ***           Attributes           **********
     *********************************************
     */



    /*
     **********************************************
     ****           Constructors         **********
     **********************************************
     */

    public PlaneAppearance(Color color){
        this(color,0.3);
    }


    public PlaneAppearance(Color color, double alpha){
        super(color);
        super.setAlpha(alpha);
        super.setPhong(1);
        super.setPhongSize(700);
        super.setReflection(0.);
    }

    public PlaneAppearance(String texture){
        super(texture);
    }
    /*
     ***********************************************
     ***           Getters              ************
     ***********************************************
     */



    /*
     ***********************************************
     ***           Setters              ************
     ***********************************************
     */



    /*
     ***********************************************
     ***           Public methods       ************
     ***********************************************
     */


    /*
     ***********************************************
     ***           Private methods      ************
     ***********************************************
     */


    /*
     ***********************************************
     ***           Overrides            ************
     ***********************************************
     */

    /*
     ***********************************************
     ***           toString             ************
     ***********************************************
     */

    @Override
    public String toString() {
        return super.toString();
    }


}
