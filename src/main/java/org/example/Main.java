package org.example;

import org.example.personallibrary.Conexion;
import org.example.personallibrary.Menu;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        /*
        try (Connection cnx = Conexion.get_connection()){
        }catch (SQLException e){
            throw  new RuntimeException(e);
        }
        */
        Menu.menuApp();
    }
}