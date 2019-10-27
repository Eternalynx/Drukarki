import static java.lang.Thread.sleep;

public class Main {

    public static void drukuj(int nr)
    {
        System.out.println("drukuje..." + nr);
        try {
            sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("wydrukowano..." + nr);
    }



    public static void main(String[] args) throws InterruptedException{
        int N = 100;//wątki
        int M = 25;//drukarki



        MonitorDruk monitor = new MonitorDruk(M);

        Thread myThreads[]  = new Thread[N];
        for(int i = 0;i< N; i++)
        {
            myThreads[i] = new Thread(new wThread(monitor));
            myThreads[i].start();
        }
        for(int i = 0;i< 20; i++) {
            myThreads[i].join();
        }


    }
}
