import java.util.*;

public class Students {
    private static List<Student> students = new ArrayList<>();

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void promoteAllStudents() {
        System.out.println("Promoting all students");

        for (Student student : students) {
            student.promoteToNextSemester();
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : students) {
            System.out.println("Student: " + student.getFirstName() + " " + student.getLastName() + ", Index: " + student.getIndexNumber());
            System.out.println("Status: " + student.getStatus() + ", Semester: " + student.getCurrentSemester() + ", Failures: " + student.getFailures());
            System.out.println("Programme: " + (student.getStudyProgramme() != null ? student.getStudyProgramme().getName() : "None"));
            System.out.println();
        }
    }
}
