package com.ken.designpatternsample.strategy;

/**
 * Created by HN on 27/09/16.
 */
public class MainClass {

    public static void main (String[] args) {
        Customer customer1 = new Customer(new EmployeeStrategy());
        Customer customer2 = new Customer(new StudentStrategy());

        customer1.sale();
        customer1.getResult();

        customer2.sale();
        customer2.getResult();

    }

}
