/**
Henry Hernandez W3 PRG421 Iterator Program
 */

/**
 * Helper class to handle user interface / console interactions
 * Usage: XO xo = XO.getInstance();
 */
public class XO {

    private static final XO SINGLETON = new XO();

    /**
     * @return Singleton XO instance
     */
    public static XO getInstance() {
        return SINGLETON;
    }

    /**
     * Private default constructor for singleton pattern
     */
    private XO() {
    }

    /**
     * Display a message to the console
     *
     * @param text Text string to display
     */
    public void display(String text) {
        System.out.println(text);
    }

    /**
     * Display a custom error message to the console
     *
     * @param text Error text to display
     */
    public void displayError(String text) {
        spacer();
        display("!!!  ERROR: " + text);
        spacer();
    }

    /**
     * Display a blank line to the console
     */
    public void spacer() {
        System.out.print(System.lineSeparator());
    }

}

