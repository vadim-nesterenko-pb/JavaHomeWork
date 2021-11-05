package com.pb.v_nesterenko.hw5;

public class Reader {
    private String name;        //ФИО
    private int ticket;         //номер читательского билета
    private String faculty;     //факультет
    private String birth;       //дата рождения
    private int phone;          //телефон
    private int count;          //к-во книг у этого читателя
    private StringBuilder takedBooks = new StringBuilder("000000");
    //номер символа строки будет означать сколько у этого читателя книг, а сам символ - их кол-во (значит не больше 9 одинковіх книжек на 1го читателя

    public Reader() {
        takedBooks.append("0");
    }

    public Reader(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getCount() {
        return count;
    }

    public void takeBook() {        //этот метод выводит ТОЛЬКО к-во книг у этого читателя
        System.out.println("\n" + this.name + " взял " + count + " книг(и).");
    }

    public void takeBook(Book... books) {       //только этот метод из трёх может добавить читателю книжку
        System.out.print("\n" + this.name + " взял  книги: ");
        //из строчки, где указано сколько и каких книг у читателя увеличиваем значение на 1 для той книги, которая добавлена в этот метод
        for (Book b : books) {
            count++;        //для подсчёта кол-ва книг вообще
            b.getInfo();

            char ch = takedBooks.charAt(b.getNumBook() - 1);
            int i = (int) ch + 1;
            takedBooks.setCharAt(b.getNumBook() - 1, (char) (i));
        }

    }

    public void takeBook(String str, Book... books) {   //этот метод выводит только названия тех книг, которые взял читатель
        System.out.print(this.name + " взял  книги: ");
        for (Book b : books) {
            char ch = takedBooks.charAt(b.getNumBook() - 1);
            if (ch != '0') {
                System.out.print(b.getName() + " x " + ch + "шт. ");
            }
            System.out.println();
        }
    }

    public void returnBook(int n){
        if(count-n > 0) {
            System.out.println(name + " вернул " + n + "книг(и). ");
        } else System.out.println(name + " вернул все книги. Может даже больше, чем взял, ЛОЛ) ");
    }

    public void returnBook(Book... books){
        System.out.print(name + " вернул книги: " );
        for (Book b : books){
            System.out.print(b.getName() + ", ");
        }
        System.out.println();
    }

    public void returnBook(String str, Book...books){
        System.out.print(this.name + " вернул  книги: ");
        for (Book b : books) {
            b.getInfo();
        }
    }

}
