public class FakeDatabaseConnector {
    private static FakeDatabaseConnector instance;

    private FakeDatabaseConnector() {
        System.out.println("Creating a connection");
    }

    public static FakeDatabaseConnector getInstance() {
        if (instance == null) {
            synchronized (FakeDatabaseConnector.class) {
                if (instance == null) {
                    instance = new FakeDatabaseConnector();
                }
            }
        }
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: " + query);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Query executed successfully.");
    }

    public void closeConnection() {
        System.out.println("Closing the connection");
    }

    public static void main(String[] args) {
        FakeDatabaseConnector dbConnector1 = FakeDatabaseConnector.getInstance();
        FakeDatabaseConnector dbConnector2 = FakeDatabaseConnector.getInstance();

        System.out.println("dbConnector1: " + dbConnector1);
        System.out.println("dbConnector2: " + dbConnector2);

        dbConnector1.executeQuery("SELECT * FROM users");
        dbConnector2.executeQuery("INSERT INTO users (name, email) VALUES ('John Doe', 'john.doe@example.com')");

        dbConnector1.closeConnection();
    }
}