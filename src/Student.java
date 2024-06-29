import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String adress;
    private String phoneNumber;
    private Date birthDate;
    private String indexNumber;
    private String status;
    private int currentSemester;
    private StudyProgramme studyProgramme;
    private List<Grade> grades;

    private int failures = 0;

    public Student(String firstName, String lastName, String email, String adress, String phoneNumber, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
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


    public Date getBirthDate() {
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

    public int getFailures() {
        return failures;
    }

    public StudyProgramme getStudyProgramme() {

        return studyProgramme;
    }

    public void enrollStudent(StudyProgramme studyProgramme){
        this.studyProgramme = studyProgramme;
        this.status = "student";
    }

    public void addGrade(int grade, String subject) {
        for(Grade g : grades) {
            if(g.getSubject() == subject && grade > g.getGrade() && grade > 2) {
                failures--;
            }
        }
        if (grade<3){
            failures++;
        }
        grades.add(new Grade(subject, grade));
    }

    public void promoteToNextSemester( ){
        if (failures < studyProgramme.getAllowedFailures()){
            if (getCurrentSemester()< getStudyProgramme().getNumberOfSemesters()){
                currentSemester++;
            } else if (failures == 0){
                status = "absolwent";
            }
        }
    }





}
