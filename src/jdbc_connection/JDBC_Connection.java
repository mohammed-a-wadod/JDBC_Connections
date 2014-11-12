package jdbc_connection;

public class JDBC_Connection {

    public static void main(String[] args) {
        mySQL_operation sql = new mySQL_operation();
//        sql.select_by_ID(100);
        sql.select_all();
        sql.close_connection();
    }
    
}
