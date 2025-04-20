
public class GenericDemo {
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        GenericClass<Integer> obj = new GenericClass<>(100);
        obj.show();
        String[] strArray = { "One", "Two", "Three" };
        printArray(strArray);
    }
}
