package com.example.android.booklistingapp;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

/**
 * Loads a list of earthquakes by using an AsyncTask to perform the
 * network request to the given URL.
 */

public class BooksLoader extends AsyncTaskLoader<List<Book>> {



    /** Query URL */
    private String mUrl;

    /**
     * Constructs a new {@link BooksLoader}.
     *
     * @param context of the activity
     * @param url to load data from
     */
    public BooksLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        Log.i("Loader","TAST: onStartLoading, force load" );
        forceLoad();

    }

    /**
     * This is on a background thread.
     */
    @Override
    public List<Book> loadInBackground() {
        Log.i("Loader","TEST: loadInBackground,make a list " );
        if (mUrl == null) {

            return null;
        }

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Book> books = QueryUtils.fetchBookData(mUrl);
        return books;

    }
}
