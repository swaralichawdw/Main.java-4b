class GenericClass<T> {
    T value;
    GenericClass(T value) {
        this.value = value;
    }
    void show() {
        System.out.println("Value: " + value);
    }
}
