public class Main {
    public static void main(String[] args) {
        System.out.println("--- Student and Course Management System ---");

       
        Student student1 = new Student("Alice Wonderland");
        Student student2 = new Student("Bob Builder");
        Student student3 = new Student("Charlie Chaplin");

        
        Course course1 = new Course("Introduction to Java");
        Course course2 = new Course("Database Fundamentals");

        
        System.out.println("\nRegistered Students:");
        student1.displayDetails(); 
        student2.displayDetails(); 
        student3.displayDetails(); 

        System.out.println("\nAvailable Courses:");
        course1.displayDetails();  
        course2.displayDetails();  
    }
}