import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BillManagement billManagements = new BillManagement(0);
        Bill[] bills = new Bill[0];

        menu();
        int choice = -1;

        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Add information of new customer: ");
                    bills = billManagements.addNewInfo(scanner, bills);
                    System.out.println("Adding done!");
                    break;
                case 2:
                    System.out.print("Enter electric meter ID of customer you want to remove: ");
                    String removeMeterId = scanner.nextLine();
                    int removeIndex = billManagements.findInfoByMeterId(removeMeterId, bills);
                    if (removeIndex == -1) {
                        System.out.println("Electric meter ID not found!");
                    } else {
                        bills = billManagements.removeInfoByMeterId(removeIndex, bills);
                    }
                    System.out.println("Removing done!");

                    break;
                case 3:
                    System.out.print("Enter electric meter ID of customer you want to edit information: ");
                    String editMeterId = scanner.nextLine();
                    int editIndex = billManagements.findInfoByMeterId(editMeterId, bills);
                    if (editIndex == -1) {
                        System.out.println("Electric meter ID not found!");
                    } else {
                        billManagements.editInfoByMeterId(scanner, editIndex, bills);
                    }
                    System.out.println("Editing done!");

                    break;
                case 4:
                    billManagements.displayInfo(bills);
                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1. Add new customer");
        System.out.println("2. Delete old customer");
        System.out.println("3. Edit information of customer");
        System.out.println("4. Display list of customers");
        System.out.println("0. Exit");
    }
}
