package com.ps;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static Book[] inventory = {
            new Book(1, "ISBN-00001", "To Kill a Mockingbird", false, ""),
            new Book(2, "ISBN-00002", "1984", false, ""),
            new Book(3, "ISBN-00003", "The Great Gatsby", false, ""),
            new Book(4, "ISBN-00004", "Pride and Prejudice", false, ""),
            new Book(5, "ISBN-00005", "The Catcher in the Rye", false, ""),
            new Book(6, "ISBN-00006", "The Hobbit", true, "sheik"),
            new Book(7, "ISBN-00007", "Brave New World", true, "sheik"),
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
    public static void displayHomeScreen(){


        while(true){
            mainMenu();

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    int proceedToCheckout = 0;
                    while (proceedToCheckout != 2) {
                        showAvailableBooks(inventory);

                        System.out.println("\n");
                        System.out.println("Would you like to checkout any of the books above? ");
                        System.out.println("(Press 1 to proceed to checkout or 3 to exit back to HomeScreen)");

                        proceedToCheckout = scanner.nextInt();
                        if (proceedToCheckout == 1) {

                            System.out.println("Please enter your name for the record: ");
                            String userName = scanner.nextLine();

                            System.out.println("Please enter the Id of the book you'd like the checkout: ");
                            int checkoutBookID = scanner.nextInt();
                            for (int i = 0; i < inventory.length; i++) {
                                if (inventory[i].getId() == checkoutBookID) {
                                    inventory[i].setCheckedOutTo(userName);
                                    inventory[i].setCheckedOut(true);
                                    System.out.println("The user " + userName + " has successfully checkout the following book: " + inventory[i].getTitle());

                                }
                            }
                        } else if (proceedToCheckout == 3) {
                            break;
                        }
                    }
                case 2:
                    showCheckedOutBook(inventory);
                    System.out.println( "If you would like to check in a book please press C");
                    System.out.println(" If you want to go Home press X");

                    scanner.nextLine();
                    String checkoutOrHome = scanner.nextLine();

                    if (checkoutOrHome.equals("C")){
                        System.out.println("Please enter the ID of the book you want to check in: ");
                        int checkInUserId = scanner.nextInt();

                        checkInBook(inventory,checkInUserId);
                        showCheckedOutBook(inventory);
                    } else if (checkoutOrHome.equals("X")) {
                        break;
                    }
                case 3:
                    mainMenu();
                case 4:
                    System.out.println("You have chosen to exit the application Good Bye");
                    return;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }




    }

    public static void mainMenu(){

        System.out.println("Welcome to the community library home screen please choose one of the options: ");
        System.out.println("1) Show Available Books");
        System.out.println("2) Show Checked out Books");
        System.out.println("4) Exit the application");

//        int userInput = scanner.nextInt();
//
//        if (userInput == 1 ) {
//    int proceedToCheckout = 0;
//    while (proceedToCheckout != 2) {
//        showAvailableBooks(inventory);
//
//        System.out.println("\n");
//        System.out.println("Would you like to checkout any of the books above? ");
//        System.out.println("(Press 1 to proceed to checkout or 2 to exit back to HomeScreen)");
//
//        proceedToCheckout = scanner.nextInt();
//        if (proceedToCheckout == 1) {
//
//            System.out.println("Please enter your name for the record: ");
//            String userName = scanner.nextLine();
//
//            System.out.println("Please enter the Id of the book you'd like the checkout: ");
//            int checkoutBookID = scanner.nextInt();
//            for (int i = 0; i < inventory.length; i++) {
//                if (inventory[i].getId() == checkoutBookID) {
//                    inventory[i].setCheckedOutTo(userName);
//                    inventory[i].setCheckedOut(true);
//                    System.out.println("The user " + userName + " has successfully checkout the following book: " + inventory[i].getTitle());
//
//                }
//            }
//        }
//    }
//
//    }
//    if (userInput == 2 ){
//     showCheckedOutBook(inventory);
//            System.out.println( "If you would like to check in a book please press C");
//            System.out.println(" If you want to go Home press X");
//
//            scanner.nextLine();
//        String checkoutOrHome = scanner.nextLine();
//
//            if (checkoutOrHome.equals("C")){
//                System.out.println("Please enter the ID of the book you want to check in: ");
//                int checkInUserId = scanner.nextInt();
//
//                checkInBook(inventory,checkInUserId);
//                showCheckedOutBook(inventory);
//            }
//    }

}

//        String userChoice = scanner.nextLine();

        //1 display books avialble
//        System.out.println("The following Books are available formated in the following |id | ISBN | Title | "  );
//        showAvailableBooks(inventory);

        //2 show checked out books



    public  static void showAvailableBooks(Book[] inventory){
        System.out.println("The following are all the books currently avaiable they are formatted in the following: \n|ID | ISBN | TITLE");
        for (int i = 0; i < inventory.length ; i++) {
            if (!inventory[i].isCheckedOut()){
                System.out.println( inventory[i].getId() + " " + inventory[i].getIsbn() + " " + inventory[i].getTitle());
            }
        }
    }

    public static void showCheckedOutBook(Book[] inventory){
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].isCheckedOut() ){
                System.out.println("This book is checked out : " + inventory[i].getId() + " " + inventory[i].getIsbn()+ " " + inventory[i].getTitle() + "It has been checked out by "+ inventory[i].getCheckedOutTo());


            }
        }
    }

    public static void checkInBook(Book[] inventory,int id ){
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i].getId() == id){
                inventory[i].setCheckedOutTo("");
                inventory[i].setCheckedOut(false);
            }
        }
    };

    public static void main(String[] args) {

    displayHomeScreen();



    }
}




