package strudents;



public abstract class User implements UserInterface {
    private  String name;
    private String phone;
    private int id;
    final static String aaa = "ssss";

    public User (String phone) {
            this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract String hello();

    public static void sayHello(User user) {
        System.out.println(user.hello());
    }
}
