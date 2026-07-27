package SpringJuly26.July18.model;

import lombok.Data;

import java.util.List;

@Data
public class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private List<String> hobbies;

}
