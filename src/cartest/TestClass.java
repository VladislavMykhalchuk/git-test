package cartest;

public class TestClass {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.name = "Toyota";
        Car myCar2 = new Car();
        myCar2.name = "Nissan";
        myCar2.name = "ZAZ";
        myCar.name = "VAZ";

        String ss = myCar.drive();
        System.out.println(ss);   // или в скобки прописываем  myCar.drive()  //
        myCar.parking();

        Calculator myCalc = new Calculator();
        int result = myCalc.summ(3232,323, 3232);
        System.out.println(result);

        Car newCar = new Car();
        newCar.setYear(-100);
        Car Car3 = new Car ("Audi", 1988);

/*        String premer = "Hello World";
//        System.out.println(premer);
//        int a = 15;
//        boolean b = true;
//        char c = 'w';
//
//        String[] arr = {"banana", "apple", "pear", "strawberry"};
//        String[] arr2 = new String[4];
//        arr2[0] = "vasya";
//        arr2[1] = "Petya";
//        arr2[2] = "aaa";
//        arr2[3] = "bbb";
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == "apple") {
//                System.out.println(arr[i]);
//            } else {
//                System.out.println("Not Found");
//            }
//        }
*/    }
}
