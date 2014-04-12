package college.bookreturn;
import java.sql.*;

public class Borrower {
    // Borrower holds the borrower Id, name and address information
    private int brId;
    private String brName;
    private String brAddress;

    public Borrower() {
        this.brId = 0;
        this.brName = null;
        this.brAddress = null;
    }

    public Borrower(int borId, String borName, String borAddress) {
        this.brId = borId;
        this.brName = borName;
        this.brAddress = borAddress;
    }

    /**
     * @return boolean
     * @params String borrower id
     * check whether a borrower with given id exist in the database or not
    */
    public boolean checkBorrower(int brId) {
        boolean flag = false;
        try {
            DbConnection myConnection  = new DbConnection();
            myConnection.openConnection();

            String strSQL="SELECT b_id FROM Borrower WHERE b_id = '" + brId + "' ";
            ResultSet rs = myConnection.s.executeQuery(strSQL);
            if( rs.next() ) {
                flag = true;
            } else {
                flag = false;
            }
        } catch(SQLException e) {
            System.out.println("Error in DB " + e);
        }
        return (flag);
    }

    /**
     * @return String
     * @params int borrowerId
     * returns the name of the borrower given the id
    */
    public String getBorrowerName(int brrId) {
        String borName = "";
        try {
            DbConnection myConnection  = new DbConnection();
            myConnection.openConnection();

            String strSQL = "SELECT b_name, b_id FROM Borrower WHERE b_id = " + brrId + " ";
            ResultSet rs = myConnection.s.executeQuery(strSQL);  
            if( rs.next() ) {
                borName = rs.getString("b_name");
                System.out.println("A match found in database for" + borName);
            } else {
                System.out.println("Not match found in database. Check Query");
                borName = "";
            }
        } catch(SQLException e) {
            System.out.println("Error in DB " + e);
        }
        return (borName);
    }
}