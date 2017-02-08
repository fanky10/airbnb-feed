package io.github.fanky.airbnb.listings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import io.github.fanky.airbnb.Listing;
import io.github.fanky.airbnb.R;

public class ListingsFragment extends Fragment implements ListingsContract.View {
    private static final String ARG_LOCATION = "param1";

    private String mLocation;
    private ListingsContract.Presenter mPresenter;

    public ListingsFragment() {
        // Required empty public constructor
    }

    public static ListingsFragment newInstance(String param1) {
        ListingsFragment fragment = new ListingsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_LOCATION, param1);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mLocation = getArguments().getString(ARG_LOCATION);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_listings, container, false);
    }

    @Override
    public void showListings(List<Listing> listings) {

    }

    @Override
    public void showNoListings() {

    }

    @Override
    public void showLoadingListingsError() {

    }

    @Override
    public void setPresenter(ListingsContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
