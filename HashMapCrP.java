import java.util.HashMap;
import java.util.Map;

// A class to represent a Student with student ID and name
class Student {
    private int studentId;
    private String studentName;

    // Constructor to initialize student ID and name
    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    // Getter method for student ID
    public int getStudentId() {
        return studentId;
    }

    // Getter method for student name
    public String getStudentName() {
        return studentName;
    }
}

// Main class containing the program logic
public class StudentHashMapExample {
    public static void main(String[] args) {
        // Create a HashMap to store student IDs and names
        Map<Integer, Student> studentMap = new HashMap<>();

        // Add 5 student entries to the HashMap
        studentMap.put(20188940, new Student(20188940, "Shaimaa Al Maqbali"));
        studentMap.put(20188899, new Student(20188899, "Balqees Al Shureaqi"));
        studentMap.put(20188897, new Student(20188897, "Noura Al Saidi"));
        studentMap.put(20188887, new Student(20188887, "Afnan AL Khayari"));
        studentMap.put(20188892, new Student(20188892, "Tyba AL Mageni"));

        // Print the entire HashMap
        System.out.println("Student HashMap:");

        // Iterate through the entries of the HashMap
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            // Get the Student object for the current entry
            Student student = entry.getValue();

            // Print the student ID and name
            System.out.println("Student ID: " + student.getStudentId() + ", Name: " + student.getStudentName());
        }
    }
}
