public class Outter {
    

        // Non-static inner class
        class InnerClass {
            // ...
        }

        public static void main(String[] args) {
            // Create an instance of the outer class
            Polymorphism outer = new Polymorphism();

            // Create an instance of the inner class using the outer instance
            InnerClass inner = outer.new InnerClass();
        }
    }
    

