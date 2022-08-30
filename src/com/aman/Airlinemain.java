package com.aman;
import java.util.Scanner;

public class Airlinemain {
    public static void main(String... args){
        System.out.println("                                                                                                Welcome To Raj Airlines");
        airlineopsInterf Am = new airlineopsImpl();
       // String UserName = "Aman";
        //int password = 123;
        Scanner x = new Scanner(System.in);
        String UserName = "Aman";
        int password = 123;
        System.out.println("Enter User Name");
        String Username = x.nextLine();
        System.out.println("Enter Password");
        String Password = x.nextLine();
        if (( UserName.equalsUsername)&&( password.equalsPassword )){
           while (true){
               System.out.println("1 . UserRegistration \n 2. Ticket Booking \n 3. Cancel ticket");
               System.out.println("Enter Your Choice");
               int ch = x.nextInt();
               if (ch==1){
                   System.out.println("Enter User Registration Details");
                   System.out.println("Enter Your Name");
                   String A = x.nextLine();
                   System.out.println("Enter ID Name");
                   String B = x.nextLine();
                   System.out.println("Enter Your Identity Number");
                   String a = x.nextLine();
                   System.out.println("Enter your Age ");
                   int b = x.nextInt();
                   System.out.println("Enter Your Mobile Number");
                   double c = x.nextDouble();
                   System.out.println("Enter your Address");
                   String C = x.nextLine();
                   System.out.println();
                   System.out.print("     User Registration Successful");
                   Am.UserRegistration();
               }else if (ch ==2){
                   System.out.println("Book Ticket");
               }else if (ch==3){
                   System.out.println("Cancel Ticket");
               }

               else{
                   System.out.println(" Choose Correct Option");
               }
           }
       }
//        System.out.println("Enter User Registration Details");
//        System.out.println("Enter Your Name");
//        String A = x.nextLine();
//        System.out.println("Enter ID Name");
//        String B = x.nextLine();
//        System.out.println("Enter Your Identity Number");
//        String a = x.nextLine();
//        System.out.println("Enter your Age ");
//        int b = x.nextInt();
//        System.out.println("Enter Your Mobile Number");
//        double c = x.nextDouble();
//        System.out.println("Enter your Address");
//        String C = x.nextLine();
//        System.out.println();
//        System.out.print("     User Registration Successful");


    }

}
