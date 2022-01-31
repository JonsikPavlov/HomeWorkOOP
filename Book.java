package com.company.homeWorkOOP;

public class Book {
/*   Создать класс Book с полями: author, name, pagesAmount, readByMe,
*    конструктором, который принимает первые три поля, а readByMe устанавливает в false,
*    и с методом read (прочитать). Создать класс Bookshelf, с конструктором,
*    который принимает количество книг, которое можно поставить на полку.
*    Для класса Bookshelf реализовать методы addBook, removeBook,
*    countReadBooks(посчитать прочитанные книги), countBooks.
*    Использовать массив для реализации класса Bookshelf.*/
    private String author;
    private String name;
    private int pagesAmount;
    private boolean readByMe;

    public Book(String author, String name, int pagesAmount, boolean readByMe){
        this.author =author;
        this.name = name;
        this.pagesAmount = pagesAmount;
        this.readByMe = false;
    }
    public static boolean read(String author, String name, int pagesAmount, boolean readByMe){
        return readByMe = true;
    }

    public static void main(String[] args) {
        System.out.println(read("Tom Soer", "Pillicans", 250, false));
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }

    public boolean isReadByMe() {
        return readByMe;
    }

    public void setReadByMe(boolean readByMe) {
        this.readByMe = readByMe;
    }
}
