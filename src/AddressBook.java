import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> buddies = new ArrayList<>();

    public AddressBook(){

    }
    public void addBuddy(BuddyInfo buddy) {
        buddies.add(buddy);
        return;
    }

    public void removeBuddy(BuddyInfo buddy) {
        buddies.remove(buddy);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Address Book Yeah");
        BuddyInfo buddy1 = new BuddyInfo();
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(buddy1);
    }
}
