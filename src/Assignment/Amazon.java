package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	@SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver; 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ambujakshi.anand\\eclipse-workspace\\Selenium Training\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		//1. Launch Amazon Page and search an samsung Galaxy mobiles
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement searchbox= driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchbox.sendKeys("samsung Galaxy mobile");    
    driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
    
    //2. Get the list of item and rating print it in the console for each item
    List<String> allLinks = new ArrayList<String>();
	  List<WebElement> data = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
	  System.out.println("total mobiles are =="+data.size());//total searches coming on the page
	  
	  for(int i=0;i<data.size();i++){
		   System.out.println(data.get(i).getText());//printing all samsung phones
		   
		   ////Printing the Rating
		   List<String> allLinks1 = new ArrayList<String>();
		   List<WebElement> Rating = driver.findElements(By.xpath("//div[@class=\"sb_3XOrDvex\"]"));
		   System.out.println("Printng the rating =="+Rating.size());
	  //3. Click on the Items and displayed in the another window and 4. print the details in the console
		  
		  /* WebElement  item= driver.findElement(By.partialLinkText("Samsung Galaxy M21 (Midnight Blue, 6GB RAM, 128GB Storage"));
		  item.click(); 
		
		  System.out.println("the details of an item is:"+item.getText());
		  
		  WebElement Price=driver.findElement(By.id("priceblock_ourprice"));
		  System.out.println("the Price details is:"+Price.getText()); */

        //5. Closing the active browser  
        driver.close();
   
}
}
}

	
