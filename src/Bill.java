public class Bill {
    private Customer customer;
    private int oldIndexMeter;
    private int newIndexMeter;
    private final int PRICE = 750;

    public Bill() {
    }

    public Bill(Customer customer, int oldIndexMeter, int newIndexMeter) {
        this.customer = customer;
        this.oldIndexMeter = oldIndexMeter;
        this.newIndexMeter = newIndexMeter;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOldIndexMeter() {
        return oldIndexMeter;
    }

    public void setOldIndexMeter(int oldIndexMeter) {
        this.oldIndexMeter = oldIndexMeter;
    }

    public int getNewIndexMeter() {
        return newIndexMeter;
    }

    public void setNewIndexMeter(int newIndexMeter) {
        this.newIndexMeter = newIndexMeter;
    }

    public int payment() {
        return (this.newIndexMeter - this.oldIndexMeter) * this.PRICE;
    }

    @Override
    public String toString() {
        return "Bill{" +
                customer +
                ", oldIndexMeter=" + oldIndexMeter +
                ", newIndexMeter=" + newIndexMeter +
                ", payment=" + payment() +
                '}';
    }
}
