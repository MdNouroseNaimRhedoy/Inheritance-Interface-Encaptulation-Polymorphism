// Logger interface that will be implemented by different logging classes
interface Logger {
    void log(String message);
}

// ConsoleLogger class that implements Logger interface to log messages to the console
class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Console Log: " + message);
    }
}

class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("File Log: " + message + " (logged to a file)");
        
    }
}

class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("Database Log: " + message + " (logged to the database)");
        
    }
}

// Main Class
public class LoggingSystem {
    public static void main(String[] args) {
        // Creating instances of different loggers
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();
        Logger databaseLogger = new DatabaseLogger();

        // Logging messages using each logger
        consoleLogger.log("This is a console log message.");
        fileLogger.log("This is a file log message.");
        databaseLogger.log("This is a database log message.");
    }
}
