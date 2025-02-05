import java.util.Random;
class NumberPrinter implements Runnable {
    private int threadNumber;
    private static final int MAX_NUMBER = 50;
    private static final Random random = new Random();

    public NumberPrinter(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <= MAX_NUMBER; i++) {
            System.out.println("Thread #" + threadNumber + ": " + i);
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}