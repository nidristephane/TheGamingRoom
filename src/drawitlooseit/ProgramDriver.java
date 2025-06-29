package drawitlooseit;

/**
 * Application start-up program
 */
public class ProgramDriver {
    public static void main(String[] args) {
       
    	System.out.println("Loop to instantiate GameService and make sure we always have same instance");
        for(int i = 0; i<8; i++)
        {
        	System.out.println("Loop: " + (i+1));
        	 SingletonTester.testSingleton();
        	
        }
        
        
        GameService gameService = GameService.getInstance();
        Game game = gameService.addGame("Yellow Battle Field");
        if (game != null) {
            System.out.println(game);
            Team team = game.addTeam("Red Dragons Field", gameService.getNextTeamId());
            if (team != null) {
                System.out.println(team);
                Player player = team.addPlayer("Peter", gameService.getNextPlayerId());
                if (player != null) System.out.println(player);
            }
        }
    }
}