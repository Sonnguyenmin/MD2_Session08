package BT06.ra;

public class Main {
    public static void main(String[] args) {
        //write your code hare
        Student.change();//calling change method
        //creating objects
        Student st1 = new Student(111, "Chinh");
        Student st2 = new Student(222, "Toan");
        Student st3 = new Student(333, "James");

        st1.display();
        st2.display();
        st3.display();
    }
}
