public class MainClass {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CustomThread thread = new CustomThread(counter);
        CustomRunnable runnable = new CustomRunnable(counter);
        thread.start();
        new Thread(runnable).start();
    }
}
