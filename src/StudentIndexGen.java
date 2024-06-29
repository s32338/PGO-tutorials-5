public class StudentIndexGen {

    private static int nextAvailableIndex = 1;

    public static String getNextStudentIndex() {
        return "s"+nextAvailableIndex++;
    }
}
