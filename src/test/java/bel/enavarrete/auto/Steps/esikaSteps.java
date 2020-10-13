package bel.enavarrete.auto.Steps;

import bel.enavarrete.auto.PageObjects.esikaPageObjects;
import net.thucydides.core.annotations.Step;

public class esikaSteps {
	
	esikaPageObjects ebayObjects;
	
	@Step
	public void Browser(String strBandeja) {
		String withParameters[] = {strBandeja};
		ebayObjects.open("bandeja", withParameters);
		try {
		Thread.sleep(2500);
		}
		catch (Exception e) {
			//Do Nothing =P
		}
	}

	@Step
	public void seleccionarAsunto(String strAsunto) {
		ebayObjects.seleccionarAsunto(strAsunto);
	}

	@Step
	public void validarlinks(String strLinks) throws InterruptedException {
		ebayObjects.validarlinks(strLinks);
		ebayObjects.validarUPSS();
	}

	@Step
	public void validarUPSS() throws InterruptedException {
		ebayObjects.validarUPSS();
	}

}
