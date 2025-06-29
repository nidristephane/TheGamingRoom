package drawitlooseit;

/**
 * A simple class to hold information about a player
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * </p>
 * @author sen@snhu.edu
 *
 */
public class Player extends Entity {
	/*
	 * Constructor with an identifier and name
	 */
    public Player(long id, String name) {
        super(id, name);
    }

    public String toString() {
        return "Player - " + super.toString();
    }
}