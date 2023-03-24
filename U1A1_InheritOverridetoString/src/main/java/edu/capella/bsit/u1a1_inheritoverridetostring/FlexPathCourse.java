package edu.capella.bsit.u1a1_inheritoverridetostring;

/*Creating a public class that will inherit
attributes of Course class.
*/

public class FlexPathCourse extends Course {
    private String optionalResources;
    
    /* A parameterized constructor to input required fields inherited from the
    Course class */
    public FlexPathCourse(String code, int creditHours, String title) {
        super(code, creditHours, title);
    }
    
    /* Overriding toString to return the course code */
    @Override
    public String toString() {
        return String.format(getCode());
    }
}
