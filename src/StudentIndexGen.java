public class StudentIndexGen {

    private static int nextAvailableIndex = 0;

    public static String getNextStudentIndex() {
        return "s"+nextAvailableIndex++;
    }
}
