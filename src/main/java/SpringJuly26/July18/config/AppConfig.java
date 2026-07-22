package SpringJuly26.July18.config;

import SpringJuly26.July18.model.*;
import lombok.Value;
import lombok.val;
import org.springframework.context.annotation.Bean;
@
public class AppConfig {
    @Bean
    public Engine engine() {
        return new Engine() {
            @Override
            public String getEngineType() {
                return "";
            }

            @Override
            public double getHorsePower() {
                return 0;
            }
        };
    }

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
    public Employee employee(){
        @Value  String firstName,
        @Value String lastName,
        @Value String email){
    }
}
