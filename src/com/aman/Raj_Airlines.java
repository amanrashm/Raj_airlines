package com.aman;

public class Raj_Airlines {
    private String UserRegistration;
    private String TicketBooking;
    private String CancelTicket;

    // Default Constructor
    public Raj_Airlines(){

    }
    //Getter/Setter

    public String getUserRegistration() {
        return UserRegistration;
    }

    public void setUserRegistration(String UserRegistration) {
      this.UserRegistration = UserRegistration;
    }
    public String getTicketBooking() {
        return TicketBooking;
    }

    public void setTicketBooking(String ticketBooking) {
       this.TicketBooking = ticketBooking;
    }

    public String getCancelTicket() {
        return CancelTicket;
    }

    public void setCancelTicket(String cancelTicket) {
       this.CancelTicket = cancelTicket;
    }
}
