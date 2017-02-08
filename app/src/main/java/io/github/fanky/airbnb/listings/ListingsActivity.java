package io.github.fanky.airbnb.listings;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import io.github.fanky.airbnb.R;

public class ListingsActivity extends AppCompatActivity {

    private ListingsPresenter mListingsPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
    }
}
