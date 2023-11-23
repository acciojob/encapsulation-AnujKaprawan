package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // Attempting to access 'name' directly - Error: Cannot access private member
        // obj.name = "Direct Access"; // This will cause an error

        // Attempting to print 'name' directly - Error: Cannot access private member
        // System.out.println(obj.name); // This will cause an error

        // Using setter function to set 'name'
        obj.setName("John Doe");

        // Using getter function to access 'name'
        System.out.println("Name: " + obj.getName()); // Prints: Name: John Doe
    }
}
