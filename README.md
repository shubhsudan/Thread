# Thread
## What the program does

The program creates a new thread using the Thread class and starts it using the start() method. 

It then checks if the thread is alive using the isAlive() method and waits for the thread to finish using the join() method.

After the thread has finished, it checks if it's still alive using isAlive() again.

## Classes and methods

### Main

- main(String[] args)
  - The main method that runs the program.

### MyRunnable

- run()
  - The run method of the MyRunnable class that is executed by the new thread.
