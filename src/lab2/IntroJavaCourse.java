package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingCourses {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    
    //The getters and setters are all called in the ProgrammingCourses class
    //The values will only need to be set to the variables within this class
    /*
    private IntroJavaCourse(String courseName, String courseNumber,
            double credits, String prerequisites) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        this.credits = credits;
        this.prerequisites = prerequisites;
    }
    */

    public String getCourseNumber() {
        //The check for the course number should be done when getting it
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }
    
    public String getCourseName() {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        return courseName;
    }

    public final void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    

    private String getPrerequisites() {
        return prerequisites;
    }

    private void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    
}
