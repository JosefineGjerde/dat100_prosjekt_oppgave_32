package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSData {

	private GPSPoint[] gpspoints;
	protected int antall = 0;

	public GPSData(int n) {

		// TODO - START
		
		gpspoints = new GPSPoint[n];

		// TODO - SLUTT
	}

	public GPSPoint[] getGPSPoints() {
		return this.gpspoints;
	}
	
	protected boolean insertGPS(GPSPoint gpspoint) {

		boolean inserted = false;

		// TODO - START
		try {
			gpspoints[antall] = gpspoint;
			antall++;
			inserted = true;
		}catch (Exception e) {
		inserted = false;
		
		}
		// TODO - SLUTT
		return inserted;
	}

	public boolean insert(String time, String latitude, String longitude, String elevation) {

		GPSPoint gpspoint;
		// TODO - SLUTT
		return true;
		
	}

	public void print() {

		System.out.println("====== Konvertert GPS Data - START ======");

		// TODO - START
		
		for(int i = 0; i < gpspoints.length; i++) {
	
		System.out.printf("%s",gpspoints[i]);
		}
		// TODO - SLUTT
		
		System.out.println("====== Konvertert GPS Data - SLUTT ======");

	}
}


