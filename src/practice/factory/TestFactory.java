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
public class TestFactory {
    public static void main(String[] args) {
       Computer computer= ComputerFactory.getComputer("i7");
        computer.name();
        computer.config();

    }
}
