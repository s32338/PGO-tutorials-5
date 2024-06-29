import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String birthDate;
    private String email;
    private String adress;
    private String indexNumber;
    private String status;
    private int currentSemester;
    private StudyProgramme studyProgramme;
    private List<Grade> grades;

    public Student(String firstName, String lastName, String birthDate, String email, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.adress = adress;
        this.indexNumber = StudentIndexGen.getNextStudentIndex();
        this.status = "kandydat";
        this.currentSemester = 1;
        this.grades = new ArrayList<>();
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getBirthDate() {
        return birthDate;
    }


    public String getEmail() {
        return email;
    }


    public String getAdress() {
        return adress;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getStatus() {
        return status;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public StudyProgramme getStudyProgramme() {
        return studyProgramme;
    }

    public void enrollStudent(StudyProgramme studyProgramme){
        this.studyProgramme = studyProgramme;
        this.status = "student";
    }

    public void addGrade(int grade, String subject) {
        grades.add(new Grade(subject, grade));
    }



}
