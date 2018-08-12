package com.example.android.booklistingapp;

public class Book {

    private int mBookImage;
    private String mBookTitle;
    private String mBookAuthor;

    public Book( int bookImage, String bookTitle, String bookAuthor ){

        mBookImage = bookImage;
        mBookTitle = bookTitle;
        mBookAuthor = bookAuthor;
    }

    public int getBookImage(){
        return mBookImage;
    }

    public String getBookTitle(){
        return mBookTitle;
    }

    public String getBookAuthor(){
        return mBookAuthor;
    }

}
