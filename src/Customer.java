public class Customer {
    private String name;
    private String address;
    private String meterId;

    public Customer() {
    }

    public Customer(String name, String address, String meterId) {
        this.name = name;
        this.address = address;
        this.meterId = meterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMeterId() {
        return meterId;
    }

    public void setMeterId(String meterId) {
        this.meterId = meterId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", meterId='" + meterId + '\'' +
                '}';
    }
}
