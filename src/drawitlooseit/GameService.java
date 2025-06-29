package drawitlooseit;

import java.util.ArrayList;
import java.util.List;

/**
 * A singleton service for the game engine
 *
 * The Singleton Pattern ensures only one instance of GameService exists.
 * It provides a global access point to that instance.
 *
 * The Iterator Pattern allows safe and efficient traversal through the game list.
 * It helps check for duplicates by comparing name or id before adding or retrieving games.
 */

public class GameService {
	// List of active games
    private List<Game> games = new ArrayList<>();
   // Next game ID
    private long nextGameId = 1;
    private long nextTeamId = 1;
    private long nextPlayerId = 1;
    private static GameService service;

    private GameService() {}

    public static GameService getInstance() {
        if (service == null) {
            service = new GameService();
        }
        return service;
    }

    /**
     * Adds a game with a unique name.
     * Returns existing game if name is already used.
     */
    public Game addGame(String name) {
        for (Game g : games) {
            if (g.getName().equalsIgnoreCase(name)) {
                return null;
            }
        }
        Game game = new Game(nextGameId++, name);
        games.add(game);
        return game;
    }

    /**
     * Returns game by id using Iterator.
     */
    public Game getGame(long id) {
        for (Game g : games) {
            if (g.getId() == id) return g;
        }
        return null;
    }

    /**
     * Returns game by name using Iterator.
     */
    public Game getGame(String name) {
        for (Game g : games) {
            if (g.getName().equalsIgnoreCase(name)) return g;
        }
        return null;
    }

    /**
     * Returns total number of games.
     */
    public int getGameCount() {
        return games.size();
    }

    /**
     * Returns next playerId
     */
    public long getNextPlayerId() {
        return nextPlayerId++;
    }

    /**
     * Returns nextTeamId.
     */
    public long getNextTeamId() {
        return nextTeamId++;
    }
}