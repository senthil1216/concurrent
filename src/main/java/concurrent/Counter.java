package concurrent;

public class Counter implements Runnable {
    private int c = 0;
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            c++;
            System.out.println("Value for Thread After increment " + Thread.currentThread().getName() + " " + this.getCounter());
            c--;
            System.out.println("Value for Thread at last " + Thread.currentThread().getName() + " " + this.getCounter());
        }
        catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public int getCounter() {
        return c;
    }
}
