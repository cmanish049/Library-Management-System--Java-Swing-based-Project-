package college.bookreturn;
import java.sql.*;

public class DbConnection {
    // DbConnection holds sql statement, database name, database driver and connection string
    public Statement s;
    private String fileName;
    private String dataBase;
    private Connection conn;

    /**
     * The constructor method to initiate the database configuration
     */
    public DbConnection() {
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            this.fileName = "lib_db.mdb";
            this.dataBase = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ=";
            this.dataBase += this.fileName.trim() + ";DriverID=22;READONLY=true}";
            this.conn=null;
            this.s = null;
        } catch (ClassNotFoundException e) {
            System.err.println("Error in Loading Driver " + e );
        }
    }

    /**
     * The method to open connection to the database
     */
    public void openConnection() {
        try{
            this.conn = DriverManager.getConnection( dataBase,"","");
            this.s = conn.createStatement();
        } catch(SQLException e) {
            System.err.println("Error in connection  " + e );
        }
    }

    /**
     * The method to close connection of the database
     */
    public void closeConnection() {
        try{

            this.s.close();
            this.conn.close();
        } catch(SQLException e) {
            System.err.println("Error in closing connection  " + e );
        }
    }
}
