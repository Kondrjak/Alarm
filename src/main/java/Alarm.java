public class Alarm {

    public static String standardAlarm(int n){
        return generalAlarm(n, 30);
    }

    public static String generalAlarm(int n, int max) {
        if (n<0) {
            return "Wenn jetzt noch " + (-n) + " Leute reingehen, ist keiner mehr drin!";
        } else if (n<=max) {
            return "Maximale Personenzahl nicht überschritten";
        } else  {
            return "Alarm: Zu viele Personen!";
        }
    }

    public static String switchAlarm(int n, String alarmstufe){
        switch (alarmstufe){
            case "rot":
                return generalAlarm(n,0);
            case "gelb":
                return generalAlarm(n,30);
            case "grün":
                return generalAlarm(n,60);
            default:
                return "Fehler: Alarmstufe nicht bekannt";
        }
    }



}
