package samplecalender;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calandersample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement calendar= driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[12]"));
		calendar.click();
		
		WebElement datefield= driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		datefield.click();
		
	    WebElement date= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]"));
		date.click();
		
		WebElement datepick= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]"));
		datepick.click();
	}

}
