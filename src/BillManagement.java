import java.util.Scanner;

public class BillManagement {
    private Bill[] bills;

    public BillManagement() {
    }

    public BillManagement(Bill[] bills) {
        this.bills = bills;
    }

    public BillManagement(int size) {
        this.bills = new Bill[size];
    }

    public Bill[] getElectricBills() {
        return bills;
    }

    public void setElectricBills(Bill[] bills) {
        this.bills = bills;
    }

    public void editInfoByMeterId(Scanner scanner, int editIndex, Bill[] bills) {
        System.out.println("Enter old index meter: ");
        int oldIndexMeter = scanner.nextInt();
        System.out.println("Enter new index meter: ");
        int newIndexMeter = scanner.nextInt();
        bills[editIndex].setOldIndexMeter(oldIndexMeter);
        bills[editIndex].setNewIndexMeter(newIndexMeter);
    }

    public Bill[] removeInfoByMeterId(int index, Bill[] bills) {
        Bill[] newBills = new Bill[bills.length - 1];
        for (int i = 0; i < newBills.length; i++) {
            if (i < index) {
                newBills[i] = bills[i];
            } else {
                newBills[i] = bills[i + 1];
            }
        }
        return newBills;
    }

    public int findInfoByMeterId(String meterId, Bill[] bills) {
        int index = -1;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i].getCustomer().getMeterId().equals(meterId)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void displayInfo(Bill[] bills) {
        System.out.println("Electric bill's information of customers: ");
        for (Bill bill : bills) {
            System.out.println(bill);
        }
    }

    public Bill[] addNewInfo(Scanner scanner, Bill[] bills) {
        Bill[] newBills = new Bill[bills.length + 1];
        for (int i = 0; i < bills.length; i++) {
            newBills[i] = bills[i];
        }
        newBills[bills.length] = inputElectricBillInfo(scanner);
        return newBills;
    }

    public Bill inputElectricBillInfo(Scanner scanner) {
        Customer customer = inputCustomerInfo(scanner);
        System.out.print("Old index of electric meter: ");
        int oldIndexMeter = scanner.nextInt();
        scanner.nextLine();
        System.out.print("New index of electric meter: ");
        int newIndexMeter = scanner.nextInt();
        scanner.nextLine();
        return new Bill(customer, oldIndexMeter, newIndexMeter);
    }

    public Customer inputCustomerInfo(Scanner scanner) {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Electric meter ID: ");
        String meterId = scanner.nextLine();
        return new Customer(name, address, meterId);
    }
}
