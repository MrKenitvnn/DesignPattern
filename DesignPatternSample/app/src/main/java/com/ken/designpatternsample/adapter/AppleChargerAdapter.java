package com.ken.designpatternsample.adapter;

/**
 * Created by HN on 27/09/16.
 */
public class AppleChargerAdapter extends BaseChargerAdapter{

    public AppleChargerAdapter(int currentBalance) {
        super(currentBalance);
    }


    @Override
    public void firstTimeCharge() {
        super.firstTimeCharge();
        System.out.println("add charger by iOS system");
    }


    @Override
    public void endCharge() {
        System.out.println("____Apple__Apple__Apple____________________________Apple__100%__[END]");
    }
}
