package com.alvinsvitzer.flixbook.data.local;

import android.support.annotation.NonNull;

import com.alvinsvitzer.flixbook.data.MovieDataStore;
import com.alvinsvitzer.flixbook.data.model.Movie;
import com.alvinsvitzer.flixbook.data.model.Review;
import com.alvinsvitzer.flixbook.data.model.Trailer;

import java.util.List;

/**
 * Created by Alvin on 3/15/17.
 */

public interface MovieDataStoreInMemory extends MovieDataStore {

    void saveMovie(@NonNull Movie movie);

    void saveReviews(List<Review> reviews);

    void saveTrailers(List<Trailer> trailers);
}
