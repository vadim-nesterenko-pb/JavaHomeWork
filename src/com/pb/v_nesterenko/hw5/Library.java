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

        System.out.print("\nКниги: ");
        for (Book book: listBooks){
            book.getInfo();
        }
        System.out.println("\nЧитатели: ");
        for (Reader reader: listReaders){
            System.out.println(reader.getName());
        }

        //демонстрация 3-го метода takeBook из задания
        listReaders[1].takeBook(listBooks[0],listBooks[1],listBooks[0]);

        //демонстрация 1-го метода takeBook из задания
        listReaders[1].takeBook();

        //демонстрация 2-го метода takeBook из задания
        listReaders[1].takeBook("qqq",listBooks);   //демострацыя второго метода из задания

        //демонстрация 1-го метода retunrBook из задания
        listReaders[1].returnBook(1);
        listReaders[1].returnBook(5);

        //демонстрация 2-го метода retunrBook из задания
        listReaders[2].returnBook(listBooks);

        //демонстрация 3-го метода retunrBook из задания
        listReaders[1].returnBook("www",listBooks);
    }
}



