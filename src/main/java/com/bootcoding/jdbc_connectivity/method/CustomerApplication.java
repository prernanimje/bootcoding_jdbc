package com.bootcoding.jdbc_connectivity.method;

import java.util.List;

public class CustomerApplication {

    public static void main(String[] args) {
       JdbcUsingMethod obj1= new JdbcUsingMethod();
        List<customer> List =obj1.getAllCustomers();
        print(List);
    }
    public static void print (List<customer> getAllCustomer){
        for (customer stu:getAllCustomer){
            System.out.println(stu.getCustomerId());
            System.out.println(stu.getCity());
            System.out.println(stu.getEmail());
            System.out.println(stu.getSalesmanId());
            System.out.println();
        }
    }
}
