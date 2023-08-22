package com.bootcoding.jdbc_connectivity.method;

import com.bootcoding.jdbc_connectivity.utils.DBConnectionUtils;

import java.beans.Customizer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JdbcUsingMethod {
    public List<customer> getAllCustomers(){
        try{

            Connection connection = DBConnectionUtils.getConnection();
            Statement statement = connection.createStatement();
            String query  =  "SELECT * FROM CUSTOMER";
            ResultSet rs = statement.executeQuery(query);

            // Extract
            List<customer> customers = new ArrayList<>();
            while(rs.next()){
                // Single Row
                int custId = rs.getInt("customer_id");
                int custId2 = rs.getInt(1);
                String name = rs.getString("cust_name");
                String city = rs.getString("city");
                String email = rs.getString("email");
                int salesManId = rs.getInt("salesman_id");

                customer customer1 = new customer();
                customer1.setCustomerId(custId);
                customer1.setSalesmanId(salesManId);
                customer1.setName(name);
                customer1.setCity(city);
                customer1.setEmail(email);

                customers.add(customer1);
            }
            return customers;

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    public static int getTotalCustomerCount(){
        try{

            Connection connection = DBConnectionUtils.getConnection();
            Statement statement = connection.createStatement();
            String query  =  "SELECT count(*) FROM CUSTOMER";
            ResultSet rs = statement.executeQuery(query);

            if(rs.next()){
                int count = rs.getInt("count");
                return count;
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }
    public static int CountCity(){
        try {
            Connection connection = DBConnectionUtils.getConnection();
            Statement statement= connection.createStatement();
            String query="SELECT count(*) FROM CUSTOMER where city='Timon'";
            ResultSet rs= statement.executeQuery(query);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return 0;
    }
    public static List<customer>GetSpecificCustomer(){
        try {
            Connection connection=DBConnectionUtils.getConnection();
            Statement statement= connection.createStatement();
            String query="SELECT * FROM customer where salesman_id=11";
            ResultSet rs=statement.executeQuery(query);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public static List<customer> GetAllSpecificCity(){
        try {
            Connection connection=DBConnectionUtils.getConnection();
            Statement statement= connection.createStatement();
            String query="SELECT * from customer where city='Melaka'";
            ResultSet rs=statement.executeQuery(query);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    public static List<customer> GetCustomer(){
        try {
            Connection connection=DBConnectionUtils.getConnection();
            Statement statement= connection.createStatement();
            String query="SELECT customer from customer where customer_id=38";
            ResultSet rs=statement.executeQuery(query);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
   public static void PrintMethod(String names){


   }
    }
    // Get all customers

    // Tell me how many customers we have
    // Tell me how many customer belongs to specific city we have
    // SELECT COUNT(*) from customer where city = 'specific';

    // Get all customers who belong to specific CITY

    // Get all customers which handled by specific salesman

    // Get a Customer by customer Id

    // Business Logic + JDBC Code

