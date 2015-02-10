package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends JavaClasses {
//    String courseName;
//    private String courseNumber;
//    private double credits;
    private String prerequisites;

    /*
    A new method will be used to set the value for the variables in this class
    public setIntroJavaCourse(String courseName, String courseNumber,
            double credits, String Prerequisites){
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }
    */
    
    //method to set variables to this class
    public IntroJavaCourse(String courseName, String courseNumber,
            double credits, String Prerequisites) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
        this.setCredits(credits);
        this.setPrerequisites(prerequisites);
    }

    //I will need to override to ensure the values for these variables are
    //unique to this class
    /*
    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }
    

    @Override
    public double getCredits() {
        return credits;
    }


    public void setCredits(double credits) {
        if(credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        } else {
           this.credits = credits; 
        }
        
    }
    */
        public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
    

}
