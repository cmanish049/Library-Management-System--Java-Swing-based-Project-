package college.bookreturn;
import java.sql.*;
import java.util.Date;


public class BorrowerBook {
    // BorrowerBook holds the borrower Id, book isbn and book title information
    private int borrower_id;
    private String book_isbn;
    private String book_title;

    public BorrowerBook() {
        this.borrower_id = 0;
        this.book_isbn = "";
        this.book_title = "";
    }

    public BorrowerBook(int borrower_id, String book_isbn, String book_title) {
        this.borrower_id = borrower_id;
        this.book_isbn = book_isbn;
        this.book_title = book_title;
    }

    /**
     * @param borrowerId
     * @return String[]
     * This method returns the list of books owed to given borrower
     */
    public String[] getBookList(int borrowerId) {
        String[] booksList = new String[5];   // Maximum 5 books can be owed to borrower
        try {
            DbConnection myConnection  = new DbConnection();
            myConnection.openConnection();

            String strSQL = "SELECT b_name, bk_title FROM Borrower a, Book b, BorrowerBook c WHERE c.b_id_fk=" +
                                      borrowerId + " AND c.status=0 AND b.bk_isbn=c.bk_isbn_fk";
            ResultSet rs = myConnection.s.executeQuery(strSQL);
            int i = 0;
            while( rs.next() ) {
                booksList[i] = rs.getString("bk_title");
                i++;
            }
        } catch(SQLException e) {
            System.out.println("Error in DB " + e);
        }
        return booksList;
    }

    /**
     * @param bookTitle
     * @return String
     * This method returns the ISBN given the title of a book
     */
    public String getBookIsbn(String bookTitle) {
        String bookIsbn = "";
        try {
            DbConnection myConnection  = new DbConnection();
            myConnection.openConnection();

            String strSQL = "SELECT bk_isbn_fk, bk_title FROM BorrowerBook a,Book b WHERE b.bk_isbn=a.bk_isbn_fk AND bk_title='"+bookTitle+"'";
            ResultSet rs = myConnection.s.executeQuery(strSQL);
            if( rs.next() ) {
                bookIsbn = rs.getString("bk_isbn_fk");
            }
        } catch(SQLException e) {
            System.out.println("Error in DB " + e);
        }
        return bookIsbn;
    }

    /**
     * @param bookIsbn
     * This method return a book when borrower returns the book
     */
    public void removeItem(String bookIsbn) {
        try {
            DbConnection myConnection  = new DbConnection();
            myConnection.openConnection();

            Date dt = new Date();
            int date = dt.getDate();
            int month = dt.getMonth();
            int year = dt.getYear() + 1900;

            String strDate = String.valueOf(date);
            String strMonth = String.valueOf(month);
            String strYear = String.valueOf(year);

            String today = strMonth + "/" + strDate + "/" + strYear;

            System.out.println(today);
            String strSQL = "UPDATE BorrowerBook SET status=true, date_return='"+today+ "' WHERE bk_isbn_fk='"+bookIsbn+"'";
            ResultSet rs = myConnection.s.executeQuery(strSQL);
       
        } catch(SQLException e) {
            System.out.println("Error in DB " + e);
        }
    }
}
