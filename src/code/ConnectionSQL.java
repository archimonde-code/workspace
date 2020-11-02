package code;

import java.sql.*;

public class ConnectionSQL {
    public static final String URL = "jdbc:mysql://localhost:3306/connection";
    public static final String DB_CONNECTION = "com.mysql.cj.jdbc.Driver";
    public static final String USER = "root";
    public static final String PWD = "044235";

    public static void main(String[] args) throws SQLException {

        try {
            Class.forName(DB_CONNECTION);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("数据库连接中...");
        Connection conn = DriverManager.getConnection(URL, USER, PWD);
        Statement state = conn.createStatement();
        ResultSet res = state.executeQuery("SELECT * FROM user_info");
        while (res.next()){
            int id = res.getInt("id");
            String name = res.getString("name");
            int age = res.getInt("age");
            System.out.println("This boy name is " + name + " his id is " + id + " and his are " + age);
        }
        try{
            state.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        try{
            conn.close();
        }catch (SQLException se){
            se.printStackTrace();
        }
        System.out.println("关闭连接。。。bye");

    }
}
