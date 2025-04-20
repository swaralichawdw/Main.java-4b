//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Demo {
    int x;
    Demo() {
        x = 0;

        System.out.println("Default Constructor");
    }
    Demo(int a) {
        x = a;
        System.out.println("Parameterized Constructor");
    }
    void display() {
        System.out.println("Value: " + x);
    }
    protected void finalize() {
        System.out.println("Destructor (finalize) called");
    }
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo(10);
        d1.display();
        d2.display();
        d1 = null;
        d2 = null;
        System.gc();
    }
}
