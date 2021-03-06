package com.p6majo.transformation;


/**
 * The class Translation
 *
 * @author com.p6majo
 * @version 2020-07-21
 */
public class Dilatation extends ContinuousTransformation {

    /*
     *********************************************
     ***           Attributes           **********
     *********************************************
     */

    private double dilatation;


    /*
     **********************************************
     ****           Constructors         **********
     **********************************************
     */

    public Dilatation(double dilatation){
        super(0,1);
        this.dilatation = dilatation;

        setLabel("dilatation by "+dilatation);
    }

    /*
     ***********************************************
     ***           Getters              ************
     ***********************************************
     */



    public double getDilatation(){ return this.dilatation*super.state; }


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



}
