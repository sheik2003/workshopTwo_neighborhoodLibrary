package com.ps;

public class Book {

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id){
        this.id = id;

    }


    public int getId(){
        return id;
    }

    public  void setId(int id){
        this.id = id;
    }
}
