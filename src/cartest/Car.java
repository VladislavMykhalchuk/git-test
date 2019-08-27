package cartest;

public class Car {
    String name;
    private int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }
    public Car() {}
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        if (year < 1900) {
            System.out.println("OSHIBKA!");
        } else {
            this.year = year; // обращаемся к year, котоая находится на уровень выше//
        }
    }
    String drive() {
        String s = "Ya edu!";
        return s;
    }
    void parking() {
        System.out.println("Parking is ON");
    }
}
