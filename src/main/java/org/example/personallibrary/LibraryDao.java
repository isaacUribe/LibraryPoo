package org.example.personallibrary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface LibraryDao {
    public static void registerBookDB(LibraryModel libraryModel){
        Conexion data = new Conexion();
        //LibraryModel libMo = new LibraryModel();
        try(Connection connection = data.get_connection()){
            PreparedStatement preparedStatement = null;
            try {
                String query = "INSERT INTO book(book_name, author, isbn, pages, category)VALUES(?,?,?,?,?)";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1,libraryModel.getBookName());
                preparedStatement.setString(2, libraryModel.getAuthor());
                preparedStatement.setString(3, libraryModel.getIsbn());
                preparedStatement.setInt(4, libraryModel.getPages());
                preparedStatement.setString(5, libraryModel.getCategory());
                preparedStatement.execute();
                System.out.println("Registro de libro exitoso");

            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void updateBookDB(LibraryModel libraryModel){
        Conexion data = new Conexion();
        try (Connection connection = data.get_connection()) {
            PreparedStatement preparedStatement = null;
            try {
                String query = "UPDATE boot SET book_name = ?, author = ', isbn = ?, pages = ?, category = ? WHERE id_book = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, libraryModel.getBookName());
                preparedStatement.setString(2, libraryModel.getAuthor());
                preparedStatement.setString(3, libraryModel.getIsbn());
                preparedStatement.setInt(4, libraryModel.getPages());
                preparedStatement.setString(5, libraryModel.getCategory());
                
            }catch (SQLException e){
                System.out.println(e);
            }

        }catch (SQLException error){
            System.out.println(error);
        }

    }
    public static void deleteBookDB(int id_book){
        Conexion data = new Conexion();
        try (Connection connection = data.get_connection()) {
            PreparedStatement preparedStatement = null;
            try {
                String query = "DELETE FROM book WHERE book.id_book = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, id_book);
                preparedStatement.executeUpdate();
                System.out.println("El registro a sido eliminado exitosamente");
            }catch (SQLException error){
                System.out.println(error);
            }
        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void listBookDB() {
        Conexion data = new Conexion();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try (Connection connection = data.get_connection()) {
            String query = "SELECT * FROM book";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Id: " + resultSet.getInt("id_book"));
                System.out.println("Nombre: " + resultSet.getString("book_name"));
                System.out.println("Author: " + resultSet.getString("author"));
                System.out.println("Isbn: " + resultSet.getString("isbn"));
                System.out.println("Pages: " + resultSet.getInt("pages"));
                System.out.println("Category: " + resultSet.getString("category"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
