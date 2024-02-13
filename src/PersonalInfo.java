import java.util.HashMap;

public class PersonalInfo {
    public static HashMap<String,String> contactInfo = new HashMap<>();
    private String name;
    private String emailAddress;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public PersonalInfo(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
        contactInfo.put(name, emailAddress);
    }
    public String getPersonsName() {
        return name;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
