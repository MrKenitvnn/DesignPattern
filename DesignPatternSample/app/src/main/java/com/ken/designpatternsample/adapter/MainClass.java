package com.ken.designpatternsample.adapter;

/**
 * Created by HN on 27/09/16.
 */
public class MainClass {

    private static BaseChargerAdapter adapter;


    public static void main (String[] args) {

        User user = new User();
        adapter = new SamsungChargerAdapter(11);
        user.setAdapter(adapter);
        user.charge();


        adapter = new AppleChargerAdapter(5);
        user.setAdapter(adapter);
        user.charge();
    }


}
