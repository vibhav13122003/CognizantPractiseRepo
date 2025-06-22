public class Login {
    private static Login loggerInstance;

    private String username;
    private String password;
    
    private Login() {}

    public static Login getInstance() {
        if(loggerInstance == null) {
            loggerInstance = new Login();
        }

        return loggerInstance;
    }

    public void setUsernameAndPassword(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void displayCredentials() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
