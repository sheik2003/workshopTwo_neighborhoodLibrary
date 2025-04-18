package com.ps;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static Book[] inventory = {
            new Book(12323, "ISBN-00001", "To Kill a Mockingbird", false, ""),
            new Book(12324, "ISBN-00002", "1984", false, ""),
            new Book(12325, "ISBN-00003", "The Great Gatsby", false, ""),
            new Book(12326, "ISBN-00004", "Pride and Prejudice", false, ""),
            new Book(12327, "ISBN-00005", "The Catcher in the Rye", false, ""),
            new Book(12328, "ISBN-00006", "The Hobbit", false, ""),
            new Book(12329, "ISBN-00007", "Brave New World", false, ""),
            new Book(12330, "ISBN-00008", "Fahrenheit 451", false, ""),
            new Book(12331, "ISBN-00009", "Moby-Dick", false, ""),
            new Book(12332, "ISBN-00010", "Jane Eyre", false, ""),
            new Book(12333, "ISBN-00011", "The Lord of the Rings", false, ""),
            new Book(12334, "ISBN-00012", "Animal Farm", false, ""),
            new Book(12335, "ISBN-00013", "The Alchemist", false, ""),
            new Book(12336, "ISBN-00014", "The Kite Runner", false, ""),
            new Book(12337, "ISBN-00015", "Crime and Punishment", false, ""),
            new Book(12338, "ISBN-00016", "Wuthering Heights", false, ""),
            new Book(12339, "ISBN-00017", "Of Mice and Men", false, ""),
            new Book(12340, "ISBN-00018", "Slaughterhouse-Five", false, ""),
            new Book(12341, "ISBN-00019", "The Book Thief", false, ""),
            new Book(12342, "ISBN-00020", "One Hundred Years of Solitude", false, "")
    };

    String checkedOutTo(Book[] inventory,String name){

        return name;
    };


    public static void main(String[] args) {


        System.out.println(inventory[0].getIsbn());

    }
}




