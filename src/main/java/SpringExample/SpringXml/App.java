package SpringExample.SpringXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
      ApplicationContext context = new ClassPathXmlApplicationContext("SpringExample/SpringXml/test.xml");
      
      Car car1 = context.getBean("car1",Car.class);
      System.out.println(car1);
    }
}
