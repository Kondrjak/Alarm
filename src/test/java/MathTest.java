import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AlarmTest {

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "3, 6"}

    )
    public void checkAllowedNumberOfPersons(String threatLevel, int numberOfPeople, String expected){
        //When
        String actual = Alarm.switchAlarm(numberOfPeople, threatLevel);
        //Then
        Assertions.assertEquals(expected, actual);
    }

}
