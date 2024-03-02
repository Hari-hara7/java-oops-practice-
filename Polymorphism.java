public class Polymorphism {

    // Non-static inner class
    class InnerClass {
        // ...
    }

    public static void main(String[] args) {
        // Error: No enclosing instance of type Polymorphism is accessible
        // Must qualify the allocation with an enclosing instance of type Polymorphism
        InnerClass inner = new InnerClass();
    }
}
