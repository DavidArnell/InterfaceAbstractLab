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
            /*
            Setting the values from the startup class was the wrong way to go
            
        IntroToProgrammingCourse intro = new 
            IntroToProgrammingCourse("Intro to Programming", "1" ,4);
        
        IntroJavaCourse introJava = new
            IntroJavaCourse("Intro to Java", "2",
            4, "Intro to Programming");
        
        AdvancedJavaCourse advancedJave = new
            AdvancedJavaCourse("Advanced Java", "3",
            4, "Intro to Java");        
        */
            
        //Creating instances of each class through my interface
            //Should not have pluralised "ProgrammingCourses"
            ProgrammingCourses introToProgramming = new IntroToProgrammingCourse();
            ProgrammingCourses introJavaCourse = new IntroJavaCourse();
            ProgrammingCourses advancedJavaCourse = new AdvancedJavaCourse();
            
            //Setting values to the classes
            introToProgramming.setCourseName("Intro to Programming");
            introToProgramming.setCourseNumber("1");
            introToProgramming.setCredits(4);
            
            introJavaCourse.setCourseName("Intro to Java");
            introJavaCourse.setCourseNumber("2");
            introJavaCourse.setCredits(4);
            
            advancedJavaCourse.setCourseName("Advanced Java");
            advancedJavaCourse.setCourseNumber("3");
            advancedJavaCourse.setCredits(4);
    }
    
}
