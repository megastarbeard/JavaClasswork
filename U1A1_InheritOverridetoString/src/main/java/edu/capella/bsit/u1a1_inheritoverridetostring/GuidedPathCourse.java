package edu.capella.bsit.u1a1_inheritoverridetostring;

/* Creating a public class to inherit the attributes of the Course class */

public class GuidedPathCourse extends Course {
    /* Creating attributes necessary for Guided Path */
private int duration;
private String requiredResources;

/* A parameterized constructor to input required fields inherited from the
    Course class */
public GuidedPathCourse(String code, int creditHours, String title) {
    super(code, creditHours, title);
}

/* Overriding toString to return the course code */
    @Override
    public String toString() {
        return String.format(getCode());
    }
    
    
}
