package com.ken.designpatternsample.strategy;

/**
 * Created by HN on 27/09/16.
 */
public class StudentStrategy implements IMarketingStrategy {

    @Override
    public void sale() {
        System.out.println("I'm poor. Do not lie me.");
    }

    @Override
    public int getResult() {
        // do some thing to get result
        return 8;
    }

}
