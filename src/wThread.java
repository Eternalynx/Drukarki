import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Thread.sleep;

public class wThread implements Runnable {

    MonitorDruk monitor;


    public wThread(MonitorDruk monitor)
    {
        this.monitor = monitor;
    }


    @Override
    public void run() {

        int nr_drukarki;


        while(true)
        {
            try {
                sleep(ThreadLocalRandom.current().nextInt(0, 4000));
            } catch (InterruptedException e) {
            }
            nr_drukarki = monitor.zarezerwuj();
            Main.drukuj(nr_drukarki);
            monitor.zwolnij(nr_drukarki);





        }




    }
}

