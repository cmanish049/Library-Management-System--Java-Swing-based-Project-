package college.bookreturn;
import java.sql.*;

public class Fine {
    // Fine class holds information about date book borrowed, due date, date of return, fine amount and status
    private Date dateBorrow;
    private Date dateDue;
    private Date dateReturn;
    private double amount;
    private boolean status;   // set true when book is returned

    Fine() {
        this.amount =  0.0;
        this.status = false;
    }
    /**
     * @param borrowerId
     * @return double
     * The method returns the fine amount against a borrower
     */
    public double getFineAmount(int brId) {
        double fineAmount = 0.0;
        try {
            DbConnection myConnection  = new DbConnection();
            myConnection.openConnection();

            String strSQL = "SELECT date_due,date_return FROM BorrowerBook WHERE b_id_fk='"+brId+"' AND status='true'";
            ResultSet rs = myConnection.s.executeQuery(strSQL);
            while ( rs.next() ) {
                dateDue = rs.getDate("date_due");
                dateReturn = rs.getDate("date_return");
                dateBorrow = rs.getDate("date_borrow");
            } 
        } catch(SQLException e) {
            System.out.println("Error in DB " + e);
        }
        return fineAmount;
    }
}
