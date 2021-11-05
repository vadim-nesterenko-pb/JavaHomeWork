package com.pb.v_nesterenko.hw5;

public class Library {

    public static void main(String[] args) {
        Book[] listBooks = new Book[3];
        listBooks[0] = new Book("Словарь", "Грей А.", 1111);
        listBooks[1] = new Book("Учебник", "Браун Б.", 2222);
        listBooks[2] = new Book("Журнал", "Вайт В.", 3333);

        Reader[] listReaders = new Reader[3];
        listReaders[0] = new Reader("Иванов Г.");
        listReaders[1] = new Reader("Петров Д.");
        listReaders[2] = new Reader("Сидоров Е.");

        System.out.println("Книги: ");
        for (Book book: listBooks){
            book.getInfo();
        }
        System.out.println("Читатели: ");
        for (Reader reader: listReaders){
            System.out.println(reader.getName());
        }

        listReaders[1].takeBook(listBooks[0],listBooks[1],listBooks[0]);

        listReaders[1].takeBook();

        listReaders[1].takeBook("qqq",listBooks);


    }
}



