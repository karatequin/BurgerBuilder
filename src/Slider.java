
public class Slider {

    private int numberOfBurgers;
    private final int MAX = 8;


    public Slider(int startvalue){
        numberOfBurgers = startvalue;
    }

    public synchronized int addOne(){
        try
        {
            while(numberOfBurgers >= MAX){
                wait();
            }
            numberOfBurgers++;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return numberOfBurgers;

    }

    public synchronized int takeOne(){
        try {

            while (numberOfBurgers == 0) {
                wait();
            }
            numberOfBurgers--;
            notifyAll();
        } catch (InterruptedException e) {
            {
                e.printStackTrace();
            }

        }
            return numberOfBurgers;

    }
}
