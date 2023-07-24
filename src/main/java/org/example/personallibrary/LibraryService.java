package org.example.personallibrary;

import java.util.Scanner;

public class LibraryService {
    static Scanner sc = new Scanner(System.in);

    public static void createBook (){
        System.out.println("Ingrese el nombre del libro: ");
        String name = sc.nextLine();
        System.out.println("Ingrese el nombre del author");
        String autor = sc.nextLine();
        System.out.println("Ingrese el ISBN");
        String isbn = sc.nextLine();
        System.out.println("Ingrese el numero de paginas");
        int pages = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese la categoria del libro");
        String category = sc.nextLine();

        LibraryModel registerBook = new LibraryModel();
        registerBook.setBookName(name);
        registerBook.setAuthor(autor);
        registerBook.setIsbn(isbn);
        registerBook.setPages(pages);
        registerBook.setCategory(category);

        LibraryDao.registerBookDB(registerBook);
    }
    public static void listBook(){
        LibraryDao.listBookDB();
    }
    public static void deleteBook(){
        System.out.println("Ingrese el id del libro que quiere eliminar");
        int idBook = Integer.parseInt(sc.nextLine());
        LibraryDao.deleteBookDB(idBook);
    }
    public static void updatebook(){
        System.out.println("Indique el nombre a actualizar");
        String bookName = sc.nextLine();
        System.out.println("Indique el nombre del author a actualizar");
        String author = sc.nextLine();
        System.out.println("Indique el isbn a actualizar");
        String isnb = sc.nextLine();
        System.out.println("Indique el id del libro a actualizar");
        int id = Integer.parseInt(sc.nextLine());

        LibraryModel updatingBook = new LibraryModel();
        updatingBook.setBookName(bookName);
        updatingBook.setAuthor(author);
        updatingBook.setIsbn(isnb);
        updatingBook.setId_book(id);
    }
}
