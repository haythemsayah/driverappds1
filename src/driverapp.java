class DriverApp {
    private String driverId;
    private Address currentLocation;
    private Client client;
    private Address destination;
    private static final int TIME_TO_ARRIVE = 5; // Assume 5 minutes for simplicity

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public void setCurrentLocation(Address currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDestination(Address destination) {
        this.destination = destination;
    }

    public void notifyArrivalTime() {
        System.out.println("Driver will arrive in " + TIME_TO_ARRIVE + " minutes. Client: "  +
                ", Destination: " + destination.getAddress());
    }

    public void startTrip() {
        System.out.println("Trip started. Driver: " + driverId + ", Client: "  +
                ", Destination: " + destination.getAddress());
    }

    public void completeTrip() {
        System.out.println("Trip completed. Driver: " + driverId + ", Client: "  +
                ", Destination: " + destination.getAddress());
    }
}