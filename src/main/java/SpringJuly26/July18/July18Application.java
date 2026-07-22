package SpringJuly26.July18;

import SpringJuly26.July18.model.Car;
import SpringJuly26.July18.model.ElectricEngine;
import SpringJuly26.July18.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class July18Application {

	public static void main(String[] args) {
		SpringApplication.run(July18Application.class, args);


	/*@GetMapping("api/message")
	public Map<String,String> greeting(){
		return Collections.singletonMap("message","Hello World!");
	}*/

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
		Car car = applicationContext.getBean("car", Car.class);
		System.out.println("Engine : " + car.getEngine().getEngineType() );
		System.out.println("EngineHorsePower: " + car.getEngine().getHorsePower() );


		Employee employee = applicationContext.getBean("employee", Employee.class);
		System.out.println(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getEmail() + employee.getHobbies() );


	}

}
