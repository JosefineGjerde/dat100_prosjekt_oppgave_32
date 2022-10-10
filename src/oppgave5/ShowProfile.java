package oppgave5;


import easygraphics.EasyGraphics;
import todo.TODO;
import oppgave1.GPSPoint;
import oppgave2.GPSData;
import oppgave2.GPSDataConverter;
import oppgave2.GPSDataFileReader;
import oppgave4.GPSComputer;

import javax.swing.JOptionPane;

public class ShowProfile extends EasyGraphics {

    private static final int MARGIN = 50;  // margin on the sides

    private static int MAXBARHEIGHT = 500; // assume no height above 500 meters

    private GPSPoint[] gpspoints;

    public ShowProfile() {

        String filename = JOptionPane.showInputDialog("GPS data filnavn: ");
        GPSComputer gpscomputer =  new GPSComputer(filename);

        gpspoints = gpscomputer.getGPSPoints();

    }

    public static void main(String[] args) {
        launch(args);
    }

    public void run() {

        int N = gpspoints.length; // number of data points

        makeWindow("Height profile", 2 * MARGIN + 3 * N, 2 * MARGIN + MAXBARHEIGHT);

        // top margin + height of drawing area
        showHeightProfile(MARGIN + MAXBARHEIGHT);
    }

    public void showHeightProfile(int ybase) {

        // ybase indicates the position on the y-axis where the columns should start

        int x = MARGIN,y;

        // TODO - START

        throw new UnsupportedOperationException(TODO.method());

        // TODO - SLUTT
    }

}
