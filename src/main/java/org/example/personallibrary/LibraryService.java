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
}
