/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models.newVersion.drawer;

import java.util.TimerTask;
import models.MainContainer;
import models.oldVersion.ReadingOrganizer;
import org.jfree.data.xy.XYSeries;

/**
 *
 * @author Kat
 */
public class DrawerTimerTask extends TimerTask {
    Drawer drawer;
    XYSeries series1 = new XYSeries(MainContainer.getListMeasurements().size());
    
    private DrawerTimerTask() {};
    public DrawerTimerTask(Drawer d) {
        drawer=d;
        drawer.getDataset().addSeries(series1);
    }

    @Override
    public void run() {
        Double temp;
        if (drawer.getCount()<drawer.getMeasurement().getListNeedfulSpeedsData().size()) {
            for (int i=drawer.getCount();i<drawer.getMeasurement().getListNeedfulSpeedsData().size();i++) {
                temp = (double)i*drawer.getFrequency()/1000;
                series1.add(temp,drawer.getMeasurement().getListNeedfulSpeedsData().get(i));
                drawer.setCount(drawer.getCount()+1);
                MainContainer.getMainFrame().setSpeedCaption(drawer.getMeasurement().getListNeedfulSpeedsData().get(i));
            }
        } else {
            if (!MainContainer.isReading) this.cancel();
        }
        
        
       //
        
    }
    
    
    
}