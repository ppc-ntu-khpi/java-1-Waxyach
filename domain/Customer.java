package domain;

public class Customer {

    private int id;
    private boolean newCustomer;
    private double total;

    public Customer(int id, boolean isNew, double total) {
        this.id = id;
        this.newCustomer = isNew;
        this.total = total;
    }

    public Customer(int id) {
        this(id, false, 1000);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isNewCustomer() {
        return newCustomer;
    }

    public void setStatus(boolean isNew) {
        this.newCustomer = isNew;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void displayCustomerInfo() {
        System.out.printf("ID: %d\n", getId());
        System.out.printf("Is new customer: %s\n", (isNewCustomer() ? "yes" : "no"));
        System.out.printf("Total purchases are: %.2f\n", getTotal());
    }
}
