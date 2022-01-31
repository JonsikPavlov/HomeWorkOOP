package com.company.homeWorkOOP;

import com.company.homeWorkOOP.Book;

public class Bookshelf {
    /*   Создать класс Book с полями: author, name, pagesAmount, readByMe,
     *    конструктором, который принимает первые три поля, а readByMe устанавливает в false,
     *    и с методом read (прочитать). Создать класс Bookshelf, с конструктором,
     *    который принимает количество книг, которое можно поставить на полку.
     *    Для класса Bookshelf реализовать методы addBook, removeBook,
     *    countReadBooks(посчитать прочитанные книги), countBooks.
     *    Использовать массив для реализации класса Bookshelf.*/
    private Book[] bookshelf;

    public Bookshelf(Book[] bookshelf){
        this.bookshelf = bookshelf;
    }

    public void addBook(Book book){
        Book[] bookshelfWithAddedBook = new Book[bookshelf.length + 1];
        System.arraycopy(bookshelf, 0, bookshelfWithAddedBook, 0,bookshelf.length);
        bookshelfWithAddedBook[bookshelfWithAddedBook.length] = book;
        bookshelf = bookshelfWithAddedBook;
    }
    public void removeBook(String name){
        Book[] bookshelfWithoutBook = new Book[bookshelf.length -1];
        for (int i = 0, j = 0; i < bookshelf.length; i++) {
            if (!bookshelf[i].getName().equals(name)){
                bookshelfWithoutBook[j] = bookshelf[i];
                j++;
            }
        }
        bookshelf = bookshelfWithoutBook;
    }
    public void countReadBooks(){
        int counter = 0;
        for (int i = 0; i < bookshelf.length; i++) {
            if (bookshelf[i].isReadByMe()){
                counter++;
            }
        }
    }
    public void counterBooks(){
        int counter = 0;
        for (int i = 0; i < bookshelf.length; i++) {
            counter++;
        }
    }
}
