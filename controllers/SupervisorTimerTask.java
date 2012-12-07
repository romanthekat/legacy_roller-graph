package controllers;

import java.util.TimerTask;
import models.MainContainer;

public class SupervisorTimerTask extends TimerTask{

	@Override
	public void run() {
		double currentSpeed = MainContainer.getListMeasurements().get(MainContainer.getListMeasurements().size()-1).getCurrentSpeed();
		System.out.println("Current speed is "+ currentSpeed);
		
				
	
		if (currentSpeed>=MainContainer.maxSpeed) {
			System.out.println("MORE THAN MAX!!!!!!!!!!!!!!!!!!!!");
			Supervisor.normalPanelActivation(7);//панель достиг 100 км 
			//TODO начался выбег. нужна дополнительная обработка ситуации
		}  else	if (currentSpeed>=MainContainer.minSpeed) {
			Supervisor.normalPanelActivation(6);
		} 
		else if (currentSpeed>= MainContainer.speedThirdThreshold) {
			Supervisor.normalPanelActivation(4);//панель включи вторую передачу разгонись до 20
		}
		else if (currentSpeed>= MainContainer.speedSecondThreshold) {
			Supervisor.normalPanelActivation(3);//панель включи вторую передачу разгонись до 20
		} else if (currentSpeed>= MainContainer.speedFirstThreshold) {
			Supervisor.normalPanelActivation(2);//панель включи первую передачу
		}
		
		
		if (!MainContainer.isReading) this.cancel();
	}

}
