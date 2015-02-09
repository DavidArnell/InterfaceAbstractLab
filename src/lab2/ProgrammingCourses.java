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
public interface ProgrammingCourses {
    
    //Each class will have these methods
    //the prerequisites method was excluded as the intro class has none
    public abstract String getCourseNumber();
    public abstract double getCredits();
    public abstract String getCourseName();
    public abstract void setCourseNumber(String courseNumber);
    public abstract void setCredits(double credits);
    public abstract void setCourseName(String courseName);


    
       
}
