package com.ken.designpatternsample.adapter;

/**
 * Created by HN on 27/09/16.
 */
public class User {

    BaseChargerAdapter mAdapter;

    public void setAdapter (BaseChargerAdapter adapter) {
        this.mAdapter = adapter;
    }


    public void charge () {
        mAdapter.charge();
    }


}
