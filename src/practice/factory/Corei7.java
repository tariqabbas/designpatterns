/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.factory;

/**
 *
 * @author Shah
 */
public class Corei7 implements Computer {

    @Override
    public void name() {
        System.out.println("this is i7 System");
    }

    @Override
    public void config() {        System.out.println("1TB HDD,"
                + "8GB RAM "
                + "3.0 GHZ PROCESSOR");

    }

}
