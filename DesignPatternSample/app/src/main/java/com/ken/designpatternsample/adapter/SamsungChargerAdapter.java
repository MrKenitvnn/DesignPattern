package com.ken.designpatternsample.adapter;

/**
 * Created by HN on 27/09/16.
 */
public class SamsungChargerAdapter extends BaseChargerAdapter{


    public SamsungChargerAdapter(int currentBalance) {
        super(currentBalance);
    }

    @Override
    public void firstTimeCharge() {
        super.firstTimeCharge();
        System.out.println("add charger by android system");
    }


    @Override
    public void endCharge() {
        super.endCharge();
        System.out.println("_________________________________Sam Sung 100%_____________________\n");
    }
}
