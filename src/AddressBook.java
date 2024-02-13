import java.util.Scanner;

public class AddressBook {
    public static Scanner input = new Scanner(System.in);
    private AddressBook() {

    }

    static void addContactInfo(){
        System.out.println("Enter the name of the contact you want to add");
        String name = input.nextLine();
        System.out.println("Enter the email address of the contact you want to add");
        String email = input.nextLine();
        PersonalInfo.contactInfo.put(name, email);
    }
    static void searchContactInfo(){
                System.out.println("Enter the name of the contact you want to search for");
                String name = input.nextLine();
        System.out.println(PersonalInfo.contactInfo.getOrDefault(name, "Contact not found"));
            }
}
