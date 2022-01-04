public class overloding {
    public static void name(String[] args) {

        Squre r = new Rectangle();
        r.name();
    }
    }
    class Squre {
        public void name() {
            System.out.println("shikha");
        }
    }
    class Rectangle extends Squre {
        public void name()
        {
            System.out.println("shishir");
        }
    }
