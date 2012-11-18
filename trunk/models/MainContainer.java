package models;

import device.si30.SI30Counter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import views.MainFrame;

/**
 * @author KhaosKat
 */
public class MainContainer {
    //старый вариант
    private static List<Integer> listOfCoordinatesNotSync = new LinkedList();
    private static List<Integer> listOfCoordinates =
            Collections.synchronizedList(listOfCoordinatesNotSync);
    ////////////////////////////////////////////////////////////////////////////
    
    
    
    
    private static List<Measurement> listMeasurementsNotSync = new LinkedList();
    private static List<Measurement> listMeasurements =
            Collections.synchronizedList(listMeasurementsNotSync);
    private static SI30Counter si30Counter = new SI30Counter();

    private static MainFrame mainFrame;
    
    //TODO тупая идея, спору нет, но это лучшее что я сейчас придумать смог
    public static boolean isReading=false;
    public static double minSpeed=2.75;
    
    //геттеры и сеттеры
    public static List<Measurement> getListMeasurements() {
        return listMeasurements;
    }

    public static SI30Counter getSi30Counter() {
        return si30Counter;
    }

    public static List<Integer> getListOfCoordinates() {
        return listOfCoordinates;
    }
    
    public static MainFrame getMainFrame() {
    	return mainFrame;
    }
    
    public static void setMainFrame (MainFrame mf) {
    	mainFrame=mf;
    }
    
}
