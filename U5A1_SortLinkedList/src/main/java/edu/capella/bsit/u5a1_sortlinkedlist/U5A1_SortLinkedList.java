package edu.capella.bsit.u5a1_sortlinkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class U5A1_SortLinkedList {

    public static void main(String[] args) {
        // Scanner creation for user input
        Scanner input = new Scanner(System.in);
        
        // Building LinkedList object to place course codes in.
        LinkedList<String> courses = new LinkedList<>();
        
        // Printing user prompt
        System.out.print("Enter 3 collections of course codes, "
                    + "one collection per line (Ex. IT3349): ");
        
        // For loop to iterate 3 inputs, also adds all input to list and splits
            // each code at space in between
        for(int i = 0; i < 3; i++) {
            String text = input.nextLine();
            courses.addAll(Arrays.asList(text.split(" ")) );
            
            // Sorts the list
            Collections.sort(courses, String.CASE_INSENSITIVE_ORDER);
            
            // Prints the size of each line and sorts in ascending order
            System.out.println("Size: " + courses.size() + " " + "Sorted: ");
            
            // Lambda expression for printing out each line.
            courses.forEach(line -> System.out.print(line + " "));
            System.out.print("\n \n");
            
            // Empties list to allow new clean input.
            courses.clear();
        }
        
        
    }
}
