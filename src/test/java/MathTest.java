import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MathTest {

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "3, 6"}

    )
    public void someKnownValues(int n, int expected){
        //When
        int actual = Math.fac(n);
        //Then
        Assertions.assertEquals(actual, expected);
    }

    @ParameterizedTest
    @CsvSource({
            "-1",
            "-2",
            "-1000"
    })

    public void throwExceptWhenNonNegative(int n){
        Assertions.assertThrows(ArithmeticException.class,
                ()->Math.fac(n));
    }

}
