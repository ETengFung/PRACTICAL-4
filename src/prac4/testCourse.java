
package prac4;

import java.util.Arrays;

public class testCourse {
     public static void main(String[] args) {
        Course course1 = new Course("Introduction to Computers", 250);
        course1.addStudent("Ali Said");
        course1.addStudent("Wong Ken");
        course1.addStudent("Peter Lim");
        System.out.print(course1.toString());
        System.out.println("List Name of Student who involved in this Course:");
        for(int i=0; i<100 ; i++){
            System.out.println(course1.getStudentNames());
        }
        
    }
}
