import main.java.SpringTutorial.service.CustomerService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		CustomerService service = context.getBean("CustomerService",
				CustomerService.class);

		System.out.println(service.findAll().get(0).getFirstname());
	}

}
