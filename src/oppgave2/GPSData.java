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

        // TODO - SLUTT
    }

    public GPSPoint[] getGPSPoints() {
        return this.gpspoints;
    }

    protected boolean insertGPS(GPSPoint gpspoint) {

        boolean inserted = false;

        // TODO - START

        throw new UnsupportedOperationException(TODO.method());

        // TODO - SLUTT
    }

    public boolean insert(String time, String latitude, String longitude, String elevation) {

        GPSPoint gpspoint;

        // TODO - START

        throw new UnsupportedOperationException(TODO.method());

        // TODO - SLUTT

    }

    public void print() {

        System.out.println("====== Konvertert GPS Data - START ======");

        // TODO - START

        throw new UnsupportedOperationException(TODO.method());

        // TODO - SLUTT

        // System.out.println("====== Konvertert GPS Data - SLUTT ======");

    }
}

