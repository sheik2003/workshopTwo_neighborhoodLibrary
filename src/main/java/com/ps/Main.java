package com.ps;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static Book[] inventory = {
            new Book(1, "ISBN-00001", "To Kill a Mockingbird", false, ""),
            new Book(2, "ISBN-00002", "1984", false, ""),
            new Book(3, "ISBN-00003", "The Great Gatsby", false, ""),
            new Book(4, "ISBN-00004", "Pride and Prejudice", false, ""),
            new Book(5, "ISBN-00005", "The Catcher in the Rye", false, ""),
            new Book(6, "ISBN-00006", "The Hobbit", false, ""),
            new Book(7, "ISBN-00007", "Brave New World", false, ""),
            new Book(8, "ISBN-00008", "Fahrenheit 451", false, ""),
            new Book(9, "ISBN-00009", "Moby-Dick", false, ""),
            new Book(10, "ISBN-00020", "One Hundred Years of Solitude", false, ""),
            new Book(11, "ISBN-00010", "Jane Eyre", false, ""),
            new Book(12, "ISBN-00011", "The Lord of the Rings", false, ""),
            new Book(13, "ISBN-00012", "Animal Farm", false, ""),
            new Book(14, "ISBN-00013", "The Alchemist", false, ""),
            new Book(15, "ISBN-00014", "The Kite Runner", false, ""),
            new Book(16, "ISBN-00015", "Crime and Punishment", false, ""),
            new Book(17, "ISBN-00016", "Wuthering Heights", false, ""),
            new Book(18, "ISBN-00017", "Of Mice and Men", false, ""),
            new Book(19, "ISBN-00018", "Slaughterhouse-Five", false, ""),
            new Book(20, "ISBN-00019", "The Book Thief", false, "")

    };



    void availableBooks(Book[] inventory){
        for (int i = 0; i < inventory.length ; i++) {
            if (!inventory[i].isCheckedOut()){
                System.out.println("The following Books are available " + inventory[i].getId() + " " + inventory[i].getIsbn() + " " + inventory[i].getTitle());
            }
        }
    }

    void checkOutBook(Book[] inventory, char userInput){
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].isCheckedOut() ){
                System.out.println("This book is checked out : " + inventory[i].getId() + " " + inventory[i].getIsbn()+ " " + inventory[i].getTitle() + "It has been checked out by "+ inventory[i].getCheckedOutTo());


            }
        }
    }

    void checkInBook(Book[] inventory,int id ){
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].getId() == id){
                inventory[i].setCheckedOutTo("");
                inventory[i].setCheckedOut(false);
            }
        }
    };



    public static void main(String[] args) {





//        System.out.println(inventory[0].getIsbn());
//        System.out.println(inventory[0].isCheckedOut());
//
//        inventory[0].setCheckedOut(true);
//        inventory[0].setCheckedOutTo("Sheik");
//        System.out.println(inventory[0].getCheckedOutTo());
//        System.out.println(inventory[0].isCheckedOut());

//        for (int i = 0; i < inventory.length; i++) {
//            System.out.println(inventory[i].getTitle() + " " + inventory[i].getIsbn()) ;
//        }
//    }

    }
}




