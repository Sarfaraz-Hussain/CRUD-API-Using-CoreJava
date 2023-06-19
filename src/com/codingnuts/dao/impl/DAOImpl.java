package com.codingnuts.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.codingnuts.dao.DAO;
import com.codingnuts.pojo.Student;

public class DAOImpl implements DAO {

    @Override
    public void saveList(List<Student> list) {
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "tesla");
            stmt = con.createStatement();
            for (Student student : list) {
                String query = String.format("insert into student values('%s', '%s', '%s')", student.getUserName(),
                        student.getEmail(), student.getRollNumber());
                stmt.executeUpdate(query);
            }
            System.out.println("insertted");
        } catch (Exception e) {
            e.getMessage();
        } finally {
            if (con != null)
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            if (stmt != null)
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
        }
    }

}
