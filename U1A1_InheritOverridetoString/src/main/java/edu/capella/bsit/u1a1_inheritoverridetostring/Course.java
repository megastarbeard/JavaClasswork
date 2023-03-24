/* Base class for Flex and Guided classes*/

package edu.capella.bsit.u1a1_inheritoverridetostring;

/* Setting class name and parameters */
public class Course {
    private String code;
    private int creditHours;
    private String title;
    
    /*Creating parameterized constructor to be
    inherited by other classes
    */
    public Course(String code, int creditHours, String title) {
        this.code = code;
        this.creditHours = creditHours;
        this.title = title;
    }
    
    /* A method to return the course code */
    public String getCode() {
        return code;
    }
    
    /* A method to return the credit hours */
    public int getCreditHourse() {
        return creditHours;
    }
    
    /* A method to return the course title */
    public String getTitle() {
        return title;
    }
    
    /* Overriding the toString method to return the course code */
    @Override
    public String toString() {
        return code;
    } 
    
}
