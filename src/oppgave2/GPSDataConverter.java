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
    		
    	int secs; 
    	int hr, min, sec; 
        /*
    	hr = Integer.parseInt(timestr.substring(11,13)); 
    	min = Integer.parseInt(timestr.substring(14,16));
    	sec = Integer.parseInt(timestr.substring(17,19));
    	secs = hr * 60 * 60 + min * 60 + sec;
*/

        /*
        en helt grei løsning du hr funnet, den fungerer også bra.
        legger ved en annen metode som også kan brukes.
        istede for å skrive inn manuelt hvor stringen skal splites kan du bruke .split(":")

        det du har skrevet da blir seende slik ut
        */
        String[] oppdeling = timestr.substring(TIME_STARTINDEX, 19).split(":");
        hr = Integer.parseInt(oppdeling[0]);
        min = Integer.parseInt(oppdeling[1]);
        sec = Integer.parseInt(oppdeling[2]);
        secs = hr * 60 * 60 + min * 60 + sec;

    	
    	return secs;

    }

    public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

        int timePoint = toSeconds(timeStr);
        double latpoint = Double.parseDouble(latitudeStr);
        double longpoint = Double.parseDouble(longitudeStr);
        double elevpoint = Double.parseDouble(elevationStr);

        return new GPSPoint(timePoint, latpoint, longpoint, elevpoint);

        

    }

}
