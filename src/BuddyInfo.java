public class BuddyInfo {

    public String getName() {
        return name;
    }

    private String name;
    private String address;
    private String PhoneNum;

    public BuddyInfo(String name, String address, String PhoneNum) {
        this.name = name;
        this.address = address;
        this.PhoneNum = PhoneNum;
    }

    public BuddyInfo() {
        this("Nobody", "123 Lonely Dr", "000-000-0000");
    }

}
