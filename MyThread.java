package threadbattle;

// A class, which creates a thread.
class MyThread implements Runnable {
    Thread thrd;

    // create a Thread, using MyThread constructor.
    MyThread(String name) {
        thrd = new Thread(this, name);
    }

    // create MyThread and run Thread.
    public static MyThread createAndRun(String name) {
        MyThread myThrd = new MyThread(name);

        myThrd.thrd.start();
        return myThrd;

    }

    // start a Thread.
    public void run() {
            
        // print player's combination 6 times.
        try {
            for(int i=0; i < 6; i++) {
                Combat.useAttack(thrd.getName()); 
                Thread.sleep(400);

                Combat.useReload(thrd.getName());
                Thread.sleep(300);

                Processing.process();
            }
        }
        catch(InterruptedException exc) {
            System.out.println(thrd.getName() + 
            " was interrupted during interaction.");
        }
    }
}