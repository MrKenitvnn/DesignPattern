package com.ken.designpatternsample.strategy;

/**
 * Created by HN on 27/09/16.
 */
public class EmployeeStrategy implements IMarketingStrategy{

    @Override
    public void sale() {
        System.out.println("Get more money");
    }

    @Override
    public int getResult() {
        // do something to get result: ex: from db
        return 23;
    }

}
