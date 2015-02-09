/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Owner
 */
public class Startup {
        public static void main(String[] args) {
        //Create Startup class for code
        //Create and use at least one instance of each class
        
        //Methods to set the values in the classes
        IntroToProgrammingCourse intro = new 
            IntroToProgrammingCourse("Intro to Programming", "1" ,4);
        
        IntroJavaCourse introJava = new
            IntroJavaCourse("Intro to Java", "2",
            4, "Intro to Programming");
        
        AdvancedJavaCourse advancedJave = new
            AdvancedJavaCourse("Advanced Java", "3",
            4, "Intro to Java");        
        
    }
    
}
