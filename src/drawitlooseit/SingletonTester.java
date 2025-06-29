package drawitlooseit;

/**
 * A class to test a singleton's behavior
 */
public class SingletonTester {
    public static void testSingleton() {
        GameService instance1 = GameService.getInstance();
        GameService instance2 = GameService.getInstance();
        System.out.println("Are both GameService instances the same? " + (instance1 == instance2));
    }
}