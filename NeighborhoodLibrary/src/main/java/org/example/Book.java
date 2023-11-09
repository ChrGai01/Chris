package org.example;

public class Book {

    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    //the c should be lower case
    private String CheckedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        CheckedOutTo = checkedOutTo;
    }

    //This is another way to write the constructor so you don't have to type false and "" a bunch of times
    public Book(int id, String isbn, String title){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.CheckedOutTo = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String setTitle() {
        return "This book is checked out out by " + this.CheckedOutTo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return CheckedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        CheckedOutTo = checkedOutTo;
    }




}
