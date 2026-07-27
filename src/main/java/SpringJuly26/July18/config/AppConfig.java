package SpringJuly26.July18.config;

import SpringJuly26.July18.model.*;
import lombok.val;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public ElectricEngine  electricEngine() {
        return new ElectricEngine() {};
    }
    @Bean
    public GasEngine gasEngine() {
        return new GasEngine() {};
    }
    @Bean
    public Car car(){
        return  new Car(electricEngine());
    }

    @Bean
    public Employee employee(
            @Value("${employee.firstName}") String firstName,
            @Value("${employee.lastName}") String lastName,
            @Value("${employee.email}") String email,
            @Value("#{'${employee.hobbies}'.split(',')}")List<String> hobbies
    ){
        Employee employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setEmail(email);
        employee.setHobbies(hobbies);
        return employee;
    }
}
