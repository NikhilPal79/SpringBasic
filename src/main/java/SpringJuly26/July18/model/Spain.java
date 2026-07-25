package SpringJuly26.July18.model;

import org.springframework.stereotype.Component;

@Component
public class Spain implements Team{
    @Override
    public String getName() {
        return "Spain";
    }
}
