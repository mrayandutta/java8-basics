package corejava.staticsamples;
public class Test {
    private static int PRIVATE_COUNTER = 0;
    public static int PUBLIC_COUNTER = 0;
    static int x;
    int y;
    static {
        x = 10;
        System.out.println("static block executed ");

    }

    static int i=0;
    Test()
    {
        System.out.println("Constructor invoked");
    }

    public static void main(String[] args) {
        // Although we have two objects, static block is executed only once.
        Test test1 = new Test();
        Test test2 = new Test();
    }
}
