package org.example.personallibrary;

import java.util.Scanner;

public class Menu {

    public static void menuApp(){
        Scanner sc = new Scanner(System.in);
        int opt;
        do {
            System.out.println("--------------------");
            System.out.println("Sistema personal de biblioteca");
            System.out.println("<<<<<<<<<<<MENU>>>>>>");
            System.out.println("1.Registrar libro\n2.Actualizar libro\n3.Listar libros\n4.Borrar Libro\n5.Salir Aplicacion");
            opt = Integer.parseInt(sc.nextLine());
            switch (opt){
                case 1:
                    System.out.println("Registrar libro");
                    LibraryService.createBook();
                    break;
                case 2:
                    System.out.println("Actualizar libro");
                    break;
                case 3:
                    System.out.println("Listar libros");
                    LibraryService.listBook();
                    break;
                case 4:
                    System.out.println("Borrar libro");
                    break;
                case 5:
                    System.out.println("Saliendo de la aplicacion");
                    break;
                default:
                    System.out.println("Por favor elija un opcion correcta");
            }
        } while (opt!=5);
    }
}
