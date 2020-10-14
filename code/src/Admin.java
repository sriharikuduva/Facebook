import metadata.Person;

public class Admin extends Person {
    public boolean blockUser(Customer customer);
    public boolean unblockUser(Customer customer);
    public boolean enablePage(Page page);
    public boolean disablePage(Page page);
}