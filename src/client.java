class Client {
    private String clientId;
    private String clientName;
    private String clientPhone;
    private Address clientAddress;

    public Client(String clientId, String clientPhone) {
        this.clientId = clientId;
        this.clientPhone = clientPhone;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientAddress(Address clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public Address getClientAddress() {
        return clientAddress;
    }
}