package SpringJuly26.July18.model;

import org.springframework.stereotype.Component;

@Component
public class Game {

    private Team team1;
    // private Team team2;

    public Game(Team team1) {
        this.team1 = team1;
    }

    public Team playSolo(){
        System.out.println("Playing Solo " + this.team1.getName());
        return team1;
    };
}
