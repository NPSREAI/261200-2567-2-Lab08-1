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

// ไม่ใส่ sleep เหมือนไม่ใส่ delay ข้อมูลจะ run ได้เร็ว การเรียงตัวขึ้นอยู่กับ cpu  การกระจายตัวก็จะน้อย
// ใส่ sleep เหมือนใส่ delay ข้อมูลจะกระจายตัวมากขึ้นตามช่วงในการหน่วง
