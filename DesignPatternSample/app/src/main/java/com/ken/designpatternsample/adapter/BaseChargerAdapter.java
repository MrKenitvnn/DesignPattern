package com.ken.designpatternsample.adapter;

/**
 * Created by HN on 27/09/16.
 */
public class BaseChargerAdapter implements ICharger, IFirstTimeCharge, IEndCharge {

    private int mCurrentBalance = 0;

    public BaseChargerAdapter (int currentBalance) {
        mCurrentBalance = currentBalance;
    }


    @Override
    public void endCharge() {
        System.out.println("[END] ... alert charge completed.");
    }

    @Override
    public void firstTimeCharge() {
        System.out.println("[START] charge ... loading info, current balance: " + mCurrentBalance);
    }

    @Override
    public void charge() {
        firstTimeCharge();
        System.out.println("charging......");
        endCharge();
    }
}
