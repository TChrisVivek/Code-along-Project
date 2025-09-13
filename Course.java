// src/Course.java
public class Course {
    // Fields
    private int courseId;
    private String courseName;

    // Static counter for unique IDs
    private static int nextCourseIdCounter = 101;

    // Constructor
    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++; // Assign unique ID and then increment
        this.courseName = courseName;
    }

    // Method to display course details
    public void displayDetails() {
        // Prefix "C" for display purposes
        System.out.println("Course ID: C" + this.courseId);
        System.out.println("Course Name: " + this.courseName);
        System.out.println("--------------------");
    }
}