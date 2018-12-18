/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import practice.singlton.SingltonPattern;

/**
 *
 * @author Shah
 */
public class TestPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //we can do this when constructor is not private 
        //SingltonPattern pattern = new SingltonPattern();

        //when constructor is private we can get instance as below       
        SingltonPattern pattern1 = SingltonPattern.getInstance();
        SingltonPattern pattern2 = SingltonPattern.getInstance();
        System.err.println("Comparings Objects " + pattern1.equals(pattern2));
        //if following two statements print samevalue it refers that both object references "pattern1" and "pattern2" 
        //refer to the same instance of SingltonPattern
        System.err.println("Hash of isnt 1  " + pattern1.hashCode());
        System.err.println("Hash of instances 2 " + pattern2.hashCode());
        
        
        
    }

}
