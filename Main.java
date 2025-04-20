class Student {
    int rollNo;
    String name;
    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 101;
        s1.name = "Alice";
        s1.display();
        Student s2 = new Student();
        s2.rollNo = 102;
        s2.name = "Bob";
        s2.display();
    }
}
