package com.fss.sdet.day1.Assignment;

public class OOPSConcept_Book {

    // Variables
    public String title;
    public String author;
    public double price;

    
    public OOPSConcept_Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //Getters & Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating an instance of Book
        OOPSConcept_Book book1 = new OOPSConcept_Book("Java Programming", "John Doe", 29.99);

        // Display the details of the book
        book1.displayDetails();
    }
}
