package com.pb.v_nesterenko.hw5;

public class Book {
    private String name;            //название
    private String author;          //автор
    private int year;               //год издания
    private final int numBook ;      //номер книги
    private static int countBook;   //считанет к-во книг

    public Book (){
        countBook++;
        this.numBook = countBook;

    }
    public Book(String name, String author, int year){
        this();
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNumBook() { return numBook; }

    public void getInfo (){
        System.out.print("\n" + name + " (" + author + " " + year + "г.) ");
    }


}
