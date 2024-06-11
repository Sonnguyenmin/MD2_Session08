package BT06.ra;

public class Student {
    private int rollNo;
    private String name;
    private static String college = "DDBIT" ;

    //constructor to initialize the variable
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    //Static method to change the value of static variable
    static void change() {
        college = "RIKKEI ACADEMY";
    }

    //method to display values
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
