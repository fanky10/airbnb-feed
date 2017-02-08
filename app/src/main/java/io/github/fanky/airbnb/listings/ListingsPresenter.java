package io.github.fanky.airbnb.listings;

import android.support.annotation.NonNull;

import io.github.fanky.airbnb.data.ListingsRepository;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by facundo.scoccia on 08/02/17.
 */

public class ListingsPresenter implements ListingsContract.Presenter {

    private final ListingsRepository mListingsRepository;
    private final ListingsContract.View mListingsView;

    public ListingsPresenter(@NonNull ListingsRepository listingsRepository, @NonNull ListingsContract.View listingsView) {
        mListingsRepository = checkNotNull(listingsRepository, "listings repository should not be null");
        mListingsView = checkNotNull(listingsView, "listings view should not be null");
    }



    @Override
    public void loadListings() {

    }

    @Override
    public void start() {

    }
}
