package threadbattle;

public class Main {
    public static void main(String[] args) {
        // create a player thread interface.
        MyThread[] players = {
            MyThread.createAndRun("Player 1"),
            MyThread.createAndRun("Player 2")
            
        };

        // wait until all threads terminate.
        try {

            // examine the interface.
            for(MyThread player : players) {
                player.thrd.join();
                System.out.println(player.thrd.getName() + 
                " finished combating.");
            }
        } 
        catch (InterruptedException exc) {
            System.out.println("Something interrupted combating termination");
        }
    }
}
