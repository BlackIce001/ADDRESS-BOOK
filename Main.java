import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            Person p1 = new Person();
            AddressBookService s1 = new AddressBookService();
            Scanner sc = new Scanner(System.in);
            s1.setValues(p1);
            System.out.println(s1.display(p1));
            AddressBook a1 = new AddressBook();
            a1.contactList.put(1, p1);
            System.out.println(a1.contactList);

            for (Map.Entry<Integer, Person> entry : a1.contactList.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            boolean check1 = false;
            System.out.println("Do you want to edit details(true/false)");
            check1 = sc.nextBoolean();
            if (check1) {
                System.out.println("Enter the first name of person to be edited:");
                String searchName = sc.next();
                s1.editDetails(searchName, a1);
            }
            boolean check2 = false;
            System.out.println("Do you want to delete details(true/false)");
            check2 = sc.nextBoolean();
            if (check2) {
                System.out.println("Enter the first name of person to be deleted:");
                String removeName = sc.next();
                s1.deleteDetails(removeName,
                        a1);
            }

            System.out.println("\n\nUpdated hashmap:");
            for (Map.Entry<Integer, Person> entry : a1.contactList.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }






