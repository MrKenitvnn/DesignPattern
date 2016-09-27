package com.ken.designpatternsample.strategy;

/**
 * Created by HN on 27/09/16.
 */
public class Customer {

    private IMarketingStrategy mMarketingStrategy;

    public Customer (IMarketingStrategy marketingStrategy) {
        this.mMarketingStrategy = marketingStrategy;
    }

    public void sale() {
        System.out.println("[START] bán hàng");
        mMarketingStrategy.sale();
        System.out.println("[END] bán hàng");
    }

    public void getResult () {
        System.out.println("[*] Báo cáo kết quả: " + mMarketingStrategy.getResult());
    }

}
