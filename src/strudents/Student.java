package strudents;

public class Student extends User {
    private int strikes ;

    public Student(String phone) {
        super(phone);

    }

    public Student (String phone, int strikes) {
        super(phone);
        this.strikes = strikes;
    }

    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }
    public String hello() {
        return "A YA STUDENT!";
    }
}
