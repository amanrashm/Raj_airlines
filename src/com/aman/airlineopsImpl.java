package com.aman;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class airlineopsImpl implements airlineopsInterf {
    Raj_Airlines Raj_airlines = new Raj_Airlines();
    Map<Double,String>UserRegistration=new HashMap<>();
    Scanner x = new Scanner(System.in);

    @Override
    public void UserRegistration(){
        System.out.println("Enter Your Name");
        String A = x.next();
        System.out.println("Enter ID Name");
        String B = x.next();
        System.out.println("Enter Your Identity Number");
        int a = x.nextInt();
        System.out.println("Enter your Age ");
        int b = x.nextInt();
        System.out.println("Enter Your Mobile Number");
        int c = x.nextInt();
        System.out.println("Enter your Address");
        String C = x.next();

        System.out.println("User Registration Successful");

    }

    @Override
    public void TicketBooking(String TicketBooking) {


    }

    @Override
    public void CancelTicket(String CancelTicket) {

    }

}
