package main.java.com.boarding.model;

public class BoardingPass {
    private String id;
    private String passengerName;
    private String flightNumber;

    public BoardingPass(String id, String passengerName, String flightNumber) {
        this.id = id;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
    }

    public String getId() {
        return id;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Passenger: " + passengerName +
               ", Flight: " + flightNumber;
    }
}
