package drawitlooseit;

/**
 * A simple class to hold information about Entity base class
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a team is
 * created.
 * </p>
 * @author sen@snhu.edu
 *
 */
public class Entity {
    private long id;
    private String name;

    public Entity() {}

    public Entity(long id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
	 * @return the id
	 */
    public long getId() {
        return id;
    }

    /**
	 * @return the name
	 */
    public String getName() {
        return name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
