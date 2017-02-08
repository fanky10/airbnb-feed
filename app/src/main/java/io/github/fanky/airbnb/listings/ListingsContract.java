package io.github.fanky.airbnb.listings;

import java.util.List;

import io.github.fanky.airbnb.BasePresenter;
import io.github.fanky.airbnb.BaseView;
import io.github.fanky.airbnb.Listing;

/**
 * Created by facundo.scoccia on 08/02/17.
 */

public interface ListingsContract {
    interface Presenter extends BasePresenter {
        void loadListings();
    }
    interface View extends BaseView<Presenter> {
        void showListings(List<Listing> listings);
        void showNoListings();
        void showLoadingListingsError();
    }
}
