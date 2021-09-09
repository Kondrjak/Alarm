public class StudentArray {
    public static String[] studentArrayFactory(int numberOfStuds){
        String[] studentArray = new String[numberOfStuds];
        for(int i=0; i<numberOfStuds; i++) {
            studentArray[i] = "Student <" + (i + 1) + ">";
        }
        return studentArray;
    }
}
