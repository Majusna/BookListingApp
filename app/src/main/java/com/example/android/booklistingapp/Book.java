package com.example.android.booklistingapp;

//class Book, makes  Book objects that has three fields to describe each


public class Book {

    private String mBookImage;
    private String mBookTitle;
    private String mBookAuthor;
    private String mUrl;

    public Book(String bookTitle, String bookAuthor, String bookImage, String urlString ){

        mBookImage = bookImage;
        mBookTitle = bookTitle;
        mBookAuthor = bookAuthor;
        mUrl = urlString;
    }

    // when method @getBookImage is called, it returns image of the book
    public String getBookImage(){ return mBookImage; }

    //when method @getBookTitle is called, it returns title of the book
    public String getBookTitle(){
        return mBookTitle;
    }

    //when method @getBookAuthor is called, it returns author of the book
    public String getBookAuthor(){
        return mBookAuthor;
    }

    public String getBookUrl(){
        return mUrl;
    }


}
