package Week1.day2;

public class Browser {

	String browserName = "Chrome";   // instance variable

    // Method 1: Launch Browser
    public void launchBrowser() {
        System.out.println("Launching Browser: " + browserName);
    }

    // Method 2: Load URL (returns a String)
    public String loadUrl() {
        return "Url loaded successfully";
    }

    // Main method in Browser class
    public static void main(String[] args) {
        // Create object of Browser class
        Browser b = new Browser();

        // Call methods
        b.launchBrowser();
        String result = b.loadUrl();
        System.out.println(result);
    }
	}

