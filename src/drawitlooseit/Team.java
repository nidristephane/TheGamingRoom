package drawitlooseit;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple class to hold information about a team
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * </p>
 * @author sen@snhu.edu
 *
 */
public class Team extends Entity {
    private List<Player> players = new ArrayList<>();

    /**
	 * constructor
	 */
    public Team(long id, String name) {
        super(id, name);
    }

    /**
	 * @return the added player
	 */
    public Player addPlayer(String name, long id) {
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(name)) {
                return null; // Duplicate name
            }
        }
        Player player = new Player(id, name);
        players.add(player);
        return player;
    }

    public String toString() {
        return "Team - " + super.toString() + ", Players: " + players.size();
    }
}