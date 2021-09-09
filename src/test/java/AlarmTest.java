import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AlarmTest {

    @ParameterizedTest
    @CsvSource({
            "rot, 30, Alarm: Zu viele Personen!"
    })

    public void checkAllowedNumberOfPersons(String threatLevel, int numberOfPeople, String expected){
        //When
        String actual = Alarm.switchAlarm(numberOfPeople, threatLevel);
        //Then
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void standardAlarm_zuVielePersonen(){
            //Input
            int n = 31;
            //Output
            String result = Alarm.standardAlarm(n);
            //Expected
            String expected = "Alarm: Zu viele Personen!";

            Assertions.assertEquals(result, expected);
    }

    @Test
    void standardAlarm_nichtZuViele(){
        //Input
        int n = 30;
        //Output
        String result = Alarm.standardAlarm(n);
        //Expected
        String expected = "Maximale Personenzahl nicht überschritten";

        Assertions.assertEquals(result, expected);
    }

    @Test
    void standardAlarm_thinkPositive(){
        //throw err if argument negative
        //Input
        int n=-2;
        //Output
        String result = Alarm.standardAlarm(n);
        //Expected
        String expected = "Wenn jetzt noch "+ (-n) +" Leute reingehen, ist keiner mehr drin!";
        
        Assertions.assertEquals(result, expected);
    }

}
