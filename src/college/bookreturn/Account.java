package college.bookreturn;
import java.sql.*;

public class Account {
    // Account holds the userID, UserName and password information
    private int userID;
    private String userName;
    private String password;

    public Account() {
        this.userID=0;
        this.userName=null;
        this.password=null;
    }

    public Account(int userID, String userName, String password) {
        this.userID=userID;
        this.userName=userName;
        this.password=password;
    }

    public void setUserID(int userID) {
        this.userID=userID;
    }

    public void setUserName(String userName) {
        this.userName=userName;
    }

    public void setUserPassword(String password) {
        this.password=password;
    }

    public int getUserID() {
        return (this.userID);
    }

    public String getUserName() {
        return (this.userName);
    }

    public String setUserPassword() {
        return (this.password);
    }

    /**
     * @return boolean
     * @param String userName
     * @param String pswd
     * check the validity of user and return true or false if or not user is found in database
    */
    public boolean checkUser(String userName, String pswd) {
        boolean flag = false;
        try {
            DbConnection myConnection  = new DbConnection();
            myConnection.openConnection();

            String strSQL = "SELECT user_name,password FROM Account WHERE user_name = '" + userName + "' AND password = '" + pswd + "'";
            ResultSet rs = myConnection.s.executeQuery(strSQL);
            if(rs.next()) {
                flag = true;
            } else {
                flag = false;
            }
        } catch(SQLException e) {
            System.out.println("Error in DB " + e);
        }
        return (flag);
    }
}
