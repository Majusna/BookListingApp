package com.example.android.booklistingapp;

//class Book, makes  Book objects that has three fields to describe each

import java.net.URL;

public class Book {

    private String mBookImage;
    private String mBookTitle;
    private String mBookAuthor;
    private String mUrl;

    public Book(String bookImage, String bookTitle, String bookAuthor, String urlString){

        mBookImage = bookImage;
        mBookTitle = bookTitle;
        mBookAuthor = bookAuthor;
        mUrl = urlString;
    }

    // when method @getBookImage is called, it returns image of the book
    public String getBookImage(){
        return mBookImage;
    }

    //when method @getBookTitle is called, it returns title of the book
    public String getBookTitle(){
        return mBookTitle;
    }

    //when method @getBookAuthor is called, it returns author of the book
    public String getBookAuthor(){
        return mBookAuthor;
    }

    //when method @getBookUrl is called, it returns url adress of the book
    public String getBookUrl(){
        return mBookAuthor;
    }

}
