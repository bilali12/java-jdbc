package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
    private Connection cnx;
    private PreparedStatement pstm;
    private ResultSet rs;
    private int ok = 0;

    private Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/gestion_etudiants_db";
        String user = "root";
        String passWord = "";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, user, passWord);

        }catch (Exception e) {
            e.printStackTrace();
        }
        return cnx;
    }

    public void initPrepar(String sql) {
        try{
            getConnection();
            pstm = cnx.prepareStatement(sql);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeSelect() {
        rs = null;
        try{
            rs = pstm.executeQuery();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }

    public int executeMaj() {

        try {
            ok = pstm.executeUpdate();
        }catch(Exception e) {
            e.printStackTrace();
        }

        return ok;
    }

    public void closeconnction() {
        try{
            if(getConnection() != null)
                cnx.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public PreparedStatement getPstm() {
        return pstm;
    }



}
