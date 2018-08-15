package com.example.android.booklistingapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Activity context, ArrayList<Book> books) {

        super(context, 0, books);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.books_list_item, parent, false);
        }

        // Find the earthquake at the given position in the list of earthquakes
        Book currentBook = getItem(position);


        ImageView bookImageView = (ImageView)listItemView.findViewById(R.id.book_image);
      //  bookImageView.setImage(currentBook.getBookImage());



        TextView bookTitleView = listItemView.findViewById(R.id.book_title);
        bookTitleView.setText(currentBook.getBookTitle());


        TextView bookAuthorView = listItemView.findViewById(R.id.book_author);
        bookAuthorView.setText(currentBook.getBookAuthor());





        return listItemView;

    }
}
