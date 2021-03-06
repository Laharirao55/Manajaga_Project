package Post_Free.Post_Property.Sale.Validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PP_Sale_WareHouse_Validation 
{


	public static void main(String[] args) throws Exception 
	{
		
			
			//browser initiation
				System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
			//open url
				driver.get("https://manajaga.com/");
				driver.manage().window().maximize();
				
			// open post free
				driver.findElement(By.id("blink_me")).click();
				
			// Select Post Property
				driver.findElement(By.xpath("//label[@for='PostProperty']")).click();
				
			//Select next button
				driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[1]")).click();
				
			// Select I am
				driver.findElement(By.xpath("//label[@for='n_pp_owner']")).click();
				
			//select property for
				driver.findElement(By.xpath("//label[@for='Sale'][contains(.,'Sale')]")).click();
				
			// Select next button
				driver.findElement(By.xpath("(//button[@class='btn btn-theme-2 nextBtn'][contains(.,'Next')])[2]")).click();
				
			//select property from DD
				WebElement propertytype_DD =driver.findElement(By.id("propertyTypeSale"));
				new Select(propertytype_DD).selectByVisibleText("Ware House");
				
				
				
				
				//total floors field validation
					WebElement TotalFloors=driver.findElement(By.id("post-totalfloors"));
					boolean flag1=TotalFloors.isDisplayed();
					System.out.println("TotalFloors Displayed -->" +flag1);
					
				//floor no. field validation
					WebElement Floorno=driver.findElement(By.id("post-floorno"));
					boolean flag2=Floorno.isDisplayed();
					System.out.println("Floorno Displayed -->" +flag2);
					
				//Area field validation
					WebElement Area=driver.findElement(By.id("post-area"));
					boolean flag3=Area.isDisplayed();
					System.out.println("Area Displayed -->" +flag3);
					
				//Total Area field validation
					WebElement areavalue=driver.findElement(By.id("post-areavalue"));
					boolean flag4=areavalue.isDisplayed();
					System.out.println("areavalue Displayed -->" +flag4);
					
				//Length field validation
					WebElement Length=driver.findElement(By.id("area-length"));
					boolean flag5=Length.isDisplayed();
					System.out.println("Length Displayed -->" +flag5);
					
				//Breadth field validation
					WebElement bredth=driver.findElement(By.id("area-bredth"));
					boolean flag6=bredth.isDisplayed();
					System.out.println("Breadth Displayed -->" +flag6);
					
				//furniture field validation
					WebElement Furniture=driver.findElement(By.id("post-furniture"));
					boolean flag7=Furniture.isDisplayed();
					System.out.println("Furniture Displayed -->" +flag7);
					
				//Building Age field validation
					WebElement BuildingAge=driver.findElement(By.id("post-buildingage"));
					boolean flag8=BuildingAge.isDisplayed();
					System.out.println("BuildingAge Displayed -->" +flag8);
					
				//OpenSides field validation
					WebElement OpenSides=driver.findElement(By.id("post-opensides"));
					boolean flag9=OpenSides.isDisplayed();
					System.out.println("OpenSides Displayed -->" +flag9);
					
				//Facing field validation
					WebElement Facing=driver.findElement(By.id("post-face"));
					boolean flag10=Facing.isDisplayed();
					System.out.println("Facing Displayed -->" +flag10);
					
					
				//Trade type field validation
					WebElement tradetype=driver.findElement(By.id("post-tradetype"));
					boolean flag12=tradetype.isDisplayed();
					System.out.println("tradetype Displayed -->" +flag12);
						
				//PropertyPermission field validation
					WebElement PropertyPermission=driver.findElement(By.id("post-permission"));
					boolean flag13=PropertyPermission.isDisplayed();
					System.out.println("PropertyPermission Displayed -->" +flag13);
						
				//Bathroom field validation
					WebElement Bathroom=driver.findElement(By.id("post-Bathroom"));
					boolean flag14=Bathroom.isDisplayed();
					System.out.println("Bathroom Displayed -->" +flag14);
						
				//parking Available field validation
					WebElement parking=driver.findElement(By.id("post-parking"));
					boolean flag15=parking.isDisplayed();
					System.out.println("parking Displayed -->" +flag15);
								
				//Total price field validation
						WebElement	totalprice=driver.findElement(By.id("post-totalprice"));
						boolean flag16=	totalprice.isDisplayed();
						System.out.println("totalprice Displayed -->" +flag16);
								
				//Response from field validation
					WebElement responsefrom=driver.findElement(By.id("post-responsefrom"));
					boolean flag17=responsefrom.isDisplayed();
					System.out.println("responsefrom Displayed -->" +flag17);
						
					System.out.println("       ");
						
					System.out.println("'Displayed all the fields'");
						
					Thread.sleep(2000);
					driver.close();
						
		
	}
	
}
