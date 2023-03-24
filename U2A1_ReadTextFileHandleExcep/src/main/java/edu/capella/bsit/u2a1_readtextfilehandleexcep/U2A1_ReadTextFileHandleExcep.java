package edu.capella.bsit.u2a1_readtextfilehandleexcep;

import java.util.*;
import java.io.FileNotFoundException;


public class U2A1_ReadTextFileHandleExcep {
    /* Creating a main method that will throw an exception as necessary */
    public static void main(String[] args) throws Exception 
    {
        /* Pointing the program to the proper text file */
        java.io.File file = new java.io.File("courses.txt");
        
        /* A try block in case of any errors */
        try {
            /* Creating a scanner object to read text from courses.txt */
        Scanner input = new Scanner(file);
        
        /* A loop to read all input */
        while (input.hasNext()) 
        {
            String courseCode = input.next();
            String creditHours = input.next();
            /* input.nextLine() prevents the course title from splitting
            between words.
            */
            String courseTitle = input.nextLine();
            /* Printing the contents of the file */
            System.out.println(
            "Course Code = " + courseCode + " | Credit Hours = " + creditHours +
                    " | Course Title = " + courseTitle);
        }
        /* Closing the input */
        input.close();
        }
        /* A catch block to intercept any exceptions, print an error message,
        and exit the program
        */
        catch(FileNotFoundException ex)
        {
            System.out.println("This file was not found.");
        }
    }
}