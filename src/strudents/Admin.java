package strudents;

public class Admin extends User {
    public Admin(String phone) {
        super(phone);
    }
    public String hello() {
        return "YA ADMIN";
    }
}
