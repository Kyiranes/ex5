public class Main {

    public static void main(String[] args) {
        new PersonalInfo("Brian Forest", "leavemealone@example.com");
        new PersonalInfo("Geoff Bills", "dontemailme@example.com");
        AddressBook.addContactInfo();
        AddressBook.searchContactInfo();
        AddressBook.searchContactInfo();
    }
}