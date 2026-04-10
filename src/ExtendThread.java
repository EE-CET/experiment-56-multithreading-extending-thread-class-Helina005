
class MyThread extends Thread {
    // Override the run() method to define the thread's task
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        // Create an instance of your custom thread class
        MyThread thread = new MyThread();
        
        // Start the thread, which automatically calls the run() method
        thread.start();
    }
}