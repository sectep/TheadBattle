package threadbattle;

// A class for processing the information.
class Processing {

    // process information.
    protected static void process() {
        for(int i = 0; i < 4; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch(InterruptedException exc) {
                System.out.println("Processing thread has been interrupted.");
            }
        }
        System.out.println();
    }
}