package drawitlooseit;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * </p>
 * 
 * @author sen@snhu.edu
 *
 */
public class Game extends Entity {
    private List<Team> teams = new ArrayList<>();

    /**
	 * Constructor with an identifier and name
	 */
    public Game(long id, String name) {
        super(id, name);
    }

    /**
	 * @return the team by name
	 */
    public Team addTeam(String name, long id) {
        for (Team team : teams) {
            if (team.getName().equalsIgnoreCase(name)) {
                return null; // Duplicate name
            }
        }
        Team team = new Team(id, name);
        teams.add(team);
        return team;
    }

    public String toString() {
        return "Game - " + super.toString() + ", Teams: " + teams.size();
    }
}