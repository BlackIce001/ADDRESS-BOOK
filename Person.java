public class Person {
    private String firstName;
    private String lastName;
    private String city;
    private String State;
    private String email;
    private int zip;
    private int phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return State;
    }

    public String getEmail() {
        return email;
    }

    public int getZip() {
        return zip;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        State = state;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

    // Add the new contact to the address book
            AddressBook.addContact  (newContact);

            System.out.print("Do you want to add another contact? (yes/no): ");
    String userInput = scanner.nextLine().toLowerCase();
    addMoreContacts = userInput.equals("yes");
}
}