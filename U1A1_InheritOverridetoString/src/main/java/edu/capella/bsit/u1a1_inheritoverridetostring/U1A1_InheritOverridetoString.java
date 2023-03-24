package edu.capella.bsit.u1a1_inheritoverridetostring;

/* A new public class for inputting and printing course information */
public class U1A1_InheritOverridetoString {

    /*Main method requiring parameterized input of course information */
public static void main(String[] args) {
    
    /* A new Course object */
    Course course = new Course("TBD", 3, "TBD");
    
    /* A new Guided Path course object */
    GuidedPathCourse guided = new GuidedPathCourse("IT2230", 3, 
            "Mobile Cloud Computing Application Development");
    
    /* A new Flex Path course object */
    FlexPathCourse flex = new FlexPathCourse("ITFP4789", 3, 
            "Introduction to Database Systems");
    
    /* Print statements to output the class names and returned course codes */
    System.out.println("Java class name = 'Course' Course Code = " + course);
    System.out.println("Java class name = 'GuidedPathCourse' Course Code = " 
            + guided);
    System.out.println("Java class name = 'FlexPathCourse' Course Code = " 
            + flex);
}    
    
    
}
