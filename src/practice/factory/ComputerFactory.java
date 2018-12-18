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
public class ComputerFactory {

    public static Computer getComputer(String computer) {
        if (computer == null) {
            return null;
        } else if (computer.equalsIgnoreCase("i5")) {
            return new Corei5();
        } else if (computer.equalsIgnoreCase("i7")) {
            return new Corei7();
        }
        return null;

    }

}
