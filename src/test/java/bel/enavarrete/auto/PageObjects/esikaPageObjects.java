package bel.enavarrete.auto.PageObjects;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.NamedUrls;
import net.thucydides.core.annotations.NamedUrl;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@DefaultUrl("https://www.mailinator.com/v3/index.jsp")
@NamedUrls(
		{
				@NamedUrl(name = "bandeja", url = "https://www.mailinator.com/v3/index.jsp?zone=public&query={1}")
		}
)
public class esikaPageObjects extends PageObject{


	public void seleccionarAsunto(String strAsunto) {
		Serenity.takeScreenshot();
		find(By.xpath("//a[contains(text(),'" + strAsunto + "')]")).click();
	}

	public void validarlinks(String strlinks) throws InterruptedException {
		Serenity.takeScreenshot();
		getDriver().switchTo().frame("msg_body");
		String html = getDriver().getPageSource();
		html = html.replaceAll("&amp;", "&");

		Boolean found;
			found = html.contains(strlinks);
			if(found){
				getDriver().get(strlinks);
				Thread.sleep(500);
				Serenity.takeScreenshot();
				//getDriver().navigate().back();
			}
			else{
			 fail("No se encontró la URL ingresada: " + strlinks);
			}

		Serenity.takeScreenshot();
	}


}
