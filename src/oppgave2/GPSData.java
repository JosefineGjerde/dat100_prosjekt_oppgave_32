package oppgave2;

import todo.TGPSData.*;
import oppgave1.GPSPoint;
import todo.TODO;

public class GPSData {

    private GPSPoint[] gpspoints;
    protected int antall = 0;

    public GPSData(int n) {

        // TODO - START
    	
        gpspoints = new GPSPoint[n];
        
 /*   	
  		Er dette riktig fremgangsmåte?
  		
  		Det jeg har prøvd er å lage objektvariabler som jeg kan bruke i 
  		referansetabellen jeg må lager lenger ned
  		
  		// og er disse under nødvendig?
  		private int time;
  		private double latitude;
  		private double longitude;
  		private double elevation;
  		//
  		 
  		g0.time = new time(11);
        g1.latitude = new latitude (20);
        g2.longitude = new longitude(28);
        g3.elevation = new elevation (35);
*/
        
        // TODO - SLUTT
    }

    public GPSPoint[] getGPSPoints() {
        return this.gpspoints;
        // er dette avsnittet ferdig??
    }

    protected boolean insertGPS(GPSPoint gpspoint) {

    	//skjønner ikke hva jeg skal bruke boolean til her?
    	
        boolean inserted = false;

        // TODO - START

        throw new UnsupportedOperationException(TODO.method());

        // TODO - SLUTT
    }

    public boolean insert(String time, String latitude, String longitude, String elevation) {

    	//her skal jeg få verdiene fra den andre klassen som er ferdig laget 
    	//på forhånd, inn i tabellen min?
    	
        GPSPoint gpspoint;

        // TODO - START

        throw new UnsupportedOperationException(TODO.method());

        // TODO - SLUTT

    }

    public void print() {

    	//her skal jeg printe ut verdiene i tabellen jeg har lagd?
    	
        System.out.println("====== Konvertert GPS Data - START ======");

        // TODO - START

        throw new UnsupportedOperationException(TODO.method());

        // TODO - SLUTT

        // System.out.println("====== Konvertert GPS Data - SLUTT ======");

    }
}

