
public class Course {
    
    private int courseId;
    private String courseName;

    
    private static int nextCourseIdCounter = 101;

    
    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++; 
        this.courseName = courseName;
    }

    
    public void displayDetails() {
        
        System.out.println("Course ID: C" + this.courseId);
        System.out.println("Course Name: " + this.courseName);
        System.out.println("--------------------");
    }
}