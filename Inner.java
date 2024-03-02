public class Inner {
   

        // Static inner class
        static class InnerClass {
            // ...
        }

        public static void main(String[] args) {
            // Now, this is valid
            InnerClass inner = new InnerClass();
        }
    }
    

