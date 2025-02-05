public class Main {
    public static void main(String[] args) {
        // สร้างเธรด 3 ตัว
        Thread t1 = new Thread(new NumberPrinter(1));
        Thread t2 = new Thread(new NumberPrinter(2));
        Thread t3 = new Thread(new NumberPrinter(3));

        t1.start();
        t2.start();
        t3.start();
    }
}
