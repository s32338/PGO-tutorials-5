public class StudyProgramme {
    private String name;
    private String description;
    private int numberOfSemesters;
    private int allowedFailures;

    public StudyProgramme(String name, String description, int numberOfSemesters, int allowedFailures) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.allowedFailures = allowedFailures;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }
    public int getAllowedFailures() {
        return allowedFailures;
    }
}
