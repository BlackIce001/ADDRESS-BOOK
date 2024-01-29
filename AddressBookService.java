import java.util.Scanner;
import java.util.*;

public class AddressBookService {
    public String display(Person p) {
        return p.getFirstName() + " " + p.getLastName() + " " + p.getCity() + " " + p.getState() + " " + p.getEmail() + " " + p.getPhoneNumber() + " " + p.getZip();
    }

    public void setValues(Person p) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String fn = sc.next();
        p.setFirstName(fn);
        System.out.println("Enter last name");
        String ln = sc.next();
        p.setLastName(ln);
        System.out.println("Enter city");
        String city = sc.next();
        p.setCity(city);
        System.out.println("Enter state");
        String state = sc.next();
        p.setState(state);
        System.out.println("Enter email");
        String email = sc.next();
        p.setEmail(email);
        System.out.println("Enter phn no");
        int phNumber = sc.nextInt();
        p.setPhoneNumber(phNumber);
        System.out.println("Enter zip");
        int zip = sc.nextInt();
        p.setZip(zip);
    }

    public void editDetails(String searchName, AddressBook a1) {
        for (Map.Entry<Integer, Person> entry : a1.contactList.entrySet()) {
            if (entry.getValue().getFirstName().equalsIgnoreCase(searchName)) {
                System.out.println("\n***Person found***");
                Person p = new Person();
                System.out.println("\nEnter new details");
                setValues(p);
                Integer key = entry.getKey();
                a1.contactList.put(key, p);
            } else {
                System.out.println("value not found");
            }
        }

    }

    public void deleteDetails(String nameToRemove, AddressBook a1) {

        Iterator<Map.Entry<Integer, Person>> iterator = a1.contactList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Person> entry = iterator.next();
            if (entry.getValue().getFirstName().equalsIgnoreCase(nameToRemove)) {
                iterator.remove();
                System.out.println("Details deleted");
            } else {
                System.out.println("value not found");
            }
        }
    }
}






