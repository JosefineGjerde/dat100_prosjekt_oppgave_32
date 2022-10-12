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

    	hr = Integer.parseInt(timestr.substring(11,13)); 
    	min = Integer.parseInt(timestr.substring(14,16));
    	sec = Integer.parseInt(timestr.substring(17,19));
    	secs = hr * 60 * 60 + min * 60 + sec;

        /*
        en helt grei løsning du hr funnet, den fungerer også bra.
        legger ved en annen metode som også kan brukes.
        istede for å skrive inn manuelt hvor stringen skal splites kan du bruke .split(":")

        det du har skrevet da blir seende slik ut
        String[] oppdeling = timestr.substring(TIME_STARTINDEX, 19).split(":");
        hr = Integer.parseInt(oppdeling[0]);
        min = Integer.parseInt(oppdeling[1]);
        sec = Integer.parseInt(oppdeling[2]);
        secs = hr * 60 * 60 + min * 60 + sec;
        */
    	
    	return secs;

    }

    public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {

        double gpspoint; 
        /*
        gpspoint = Integer.parseInt(timeStr.substring(11));
        gpspoint = Integer.parseInt(latitudeStr.substring(20));
        gpspoint = Integer.parseInt(longitudeStr.substring(28));
        gpspoint = Integer.parseInt(elevationStr.substring(35));

        ved å bruke gpspoint = [noe her] hver gang, så overskriver du de forskjellige tingene hele tiden.
        må vi bruke += slik at gpspoint blir det som tidligere er skrevet inn + det nye du ønsker å legge til

        på denne oppgaven kan vi igjen bruke .split(":")
        her er ett eksempel på hvordan inpute til denne funksjonen ser ut.
        convert("2017-08-13T08:52:26.000Z","60.385390","5.217217","61.9")
        -------^________________________________________________________^
        så vi kan starte samme steder som sist (posisjon 11 eller TIME_STARTINDEX)
        dele det opp på hver .split(",")
        så føre de tingene inn i gpspoint med += for hver ting vi legger inn.
        vi må også huske å konvertere sekundene
        fordi metoden returne et `GPSPoint`-objekt der `time` er `31946`, `latitude` er `60.385390`, `longitude` er `5.217217` og `elevation` er `61.9`.
        ---------------------------------------------------------^her__^
        vi kan da bruke den funksjonen vi lagde rett over til å gjøre det.
         */
        
        gpspoint += Integer.parseInt(timeStr.substring(TIME_STARTINDEX).split(","));
        gpspoint += Integer.parseInt(latitudeStr.substring(20).split(","));
        gpspoint += Integer.parseInt(longitudeStr.substring(28).split(","));
        gpspoint += Integer.parseInt(elevationStr.substring(35).split(","));
        

        //return gpspoint[1];

        

    }

}
