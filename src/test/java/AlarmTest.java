import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class AlarmTest {
    @Test
    void standardAlarm(){
            //Input
            int n = 31;
            //Output
            String result = Alarm.standardAlarm(n);
            //Expected
            String expected = "Alarm: Zu viele Personen!";

            Assertions.assertEquals(result, expected);
    }

    @Test
    void nichtZuVieleKeinAlarm(){
        //Input
        int n = 30;
        //Output
        String result = Alarm.standardAlarm(n);
        //Expected
        String expected = "Maximale Personenzahl nicht überschritten";

        Assertions.assertEquals(result, expected);
    }

    @Test
    void thinkPositive(){
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
