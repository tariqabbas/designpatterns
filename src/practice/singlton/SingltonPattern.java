/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice.singlton;

/**
 *
 * @author Shah
 */
public class SingltonPattern {

    private static SingltonPattern inst = null;

    private SingltonPattern() {
    }

    public static SingltonPattern getInstance() {
        if (inst == null) {
            inst = new SingltonPattern();
        }
        return inst;
    }

}
