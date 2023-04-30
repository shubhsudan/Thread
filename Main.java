public class Main {

    public static void main(String[] args) {
        // Create a new thread
        Thread thread = new Thread(new MyRunnable());

        // Start the thread
        thread.start();

        // Check if the thread is alive
        if (thread.isAlive()) {
            System.out.println("Thread is alive");
        } else {
            System.out.println("Thread is not alive");
        }

        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Check if the thread is alive again
        if (thread.isAlive()) {
            System.out.println("Thread is still alive");
        } else {
            System.out.println("Thread is not alive");
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // Print out a message
            System.out.println("Hello from a new thread!");
        }
    }

}