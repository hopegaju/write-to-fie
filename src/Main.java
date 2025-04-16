import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> studentList = new HashMap<>();

        StudentManager.addStudent(studentList, 1, "Zara");
        StudentManager.addStudent(studentList, 2, "Leo");
        StudentManager.addStudent(studentList, 3, null);        // Invalid input
        StudentManager.addStudent(studentList, 0, "Naomi");     // Invalid input
        StudentManager.addStudent(studentList, 4, "Maya");
        StudentManager.addStudent(studentList, 5, "Isaac");

        System.out.println("\n--- Sorted Student List ---");
        StudentManager.sortStudents(studentList);

        System.out.println("\n--- Searching Students ---");
        StudentManager.searchStudent(studentList, 4);
        StudentManager.searchStudent(studentList, 10); // not in map

        System.out.println("\n--- Removing Students ---");
        StudentManager.removeStudent(studentList, 2);
        StudentManager.removeStudent(studentList, 9); // not in map

        System.out.println("\n--- Highest & Lowest IDs ---");
        StudentManager.findStudentWithHighestId(studentList);
        StudentManager.findStudentWithLowestId(studentList);
    }
}
