import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentArrayTest {

    @Test
    void studentArrayFactoryValues(){
        //Input
        int numberOfStuds = 3;
        //Expected
        String[] expected = {"Student <1>", "Student <2>", "Student <3>"};
        //Actual
        String[] actual = StudentArray.studentArrayFactory(numberOfStuds);
        //Then
        Assertions.assertArrayEquals(expected, actual);
    }
}
