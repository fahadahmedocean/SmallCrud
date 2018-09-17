package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Person;

public class PersonDAO {

    private Connection connection;

    public PersonDAO() {
        ConnectionClass con = new ConnectionClass();
        try {
            connection = con.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addPerson(Person person) {
        try {
            String query = "insert into person(name, phone, profession) values ('" + person.getName() + "', '" + person.getPhone() + "', '" + person.getProfession() + "')";

            Statement stmt = connection.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
