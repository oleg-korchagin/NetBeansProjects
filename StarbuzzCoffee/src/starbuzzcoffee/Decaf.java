/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbuzzcoffee;

/**
 *
 * @author ok
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Without coffein";
    }
    
    @Override
    public double cost() {
        return 1.05;
    }
    
}
