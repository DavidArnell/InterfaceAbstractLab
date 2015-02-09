/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Owner
 */
public class Startup {
    public static void main(String[] args) {
        //Create Startup class for code
        //Create and use at least one instance of each class
        
        //JavaClasses javaClasses = new JavaClasses();
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

/*
5. In the startup class document what you think is good or bad about this
   architecture from the perspective of using abstraction and inheritance.
   (Remember, a startup class must have a main method)

    This architecture works well for they types of actions this program makes.
    In the "JavaClasses" class, I was able to create, once, the variables and
    methods that were used in the child classes. This kept the code consistant 
    for each instance a method was called.

6. When declaring variables in your startup class consider using the 
   Liskov Substitution principle. This is where you declare a variable using
   it's abstract type. For example, you could do this:
   MyAbstractSuperClass course = new AdvancedJavaCourse();
   instead of this:
   AdvancedJavaCourse course = new AdvancedJavaCourse();
   Consider when this is advantageous and when it isn't. Provide a comment
   that explains your position.
    
    I did not use this type of naming convention for this program.
    I was unable to get the naming method to work properly and felt that it
    over comlicated the code.

*/
