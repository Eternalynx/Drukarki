import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class MonitorDruk {

    private ReentrantLock[] locklist;
    private int curr = 0;

public MonitorDruk(int M)
{

    ReentrantLock[] list = new ReentrantLock[M];

    for(int i = 0;i<M;i++)
    {
        list[i] = new ReentrantLock();
    }

locklist = list;
}

public int zarezerwuj()
{

    int current;
if(++curr >= locklist.length){current = 0;curr = 0;}else current = curr;
    System.out.println("rezerwuje..."+current);
locklist[current].lock();
return current;
}

public void zwolnij(int i)
{
    locklist[i].unlock();
}








}
