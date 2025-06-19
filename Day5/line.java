import java.util.*;

class Student {
    String name;
    int id;
    Student(String n, int i) { name = n; id = i; }
    public String toString() { return id + ": " + name; }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 1));
        students.add(new Student("Bob", 2));
        students.add(new Student("Charlie", 3));

        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
