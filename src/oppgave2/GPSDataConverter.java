package oppgave2;

import todo.TODO;
import oppgave1.GPSPoint;

public class GPSDataConverter {

    // konverter tidsinformasjon i gps data punkt til antall sekunder fra midnatt
    // dvs. ignorer information om dato og omregn tidspunkt til sekunder
    // Eksempel - tidsinformasjon (som String): 2017-08-13T08:52:26.000Z
    // skal omregnes til sekunder (som int): 8 * 60 * 60 + 52 * 60 + 26

    private static int TIME_STARTINDEX = 11; // posisjon for start av tidspunkt i timestr

    public static int toSeconds(String timestr) {
    	
    	/*timestr = "8 * 60 * 60 + 52 * 60 + 26 "; 
    	String input = ("Antall sekunder");
    	 int secs = toSeconds(input);
         

        int hr = secs / 3600;
        
        int min = (secs % 3600) / 60;
        
        int sec = secs % 60;
        
        System.out.println(hr + " timer " + min + " minutter " + + sec + " sekunder ");
        
		return sec; */
    	
    	int secs; 
    	int hr, min, sec; 
    	
    	hr = Integer.parseInt(timestr.substring(11,13)); 
    	min = Integer.parseInt(timestr.substring(14,16));
    	sec = Integer.parseInt(timestr.substring(17,19));
    	secs = hr * 60 * 60 + min * 60 + sec;
    	
    	return secs;
    
    }

    public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

        double gpspoint; 
        
        gpspoint = Integer.parseInt(timeStr.substring(11));
        gpspoint = Integer.parseInt(latitudeStr.substring(20));
        gpspoint = Integer.parseInt(longitudeStr.substring(28));
        gpspoint = Integer.parseInt(elevationStr.substring(35));
        
        return GPSPoint;

        

    }

}
