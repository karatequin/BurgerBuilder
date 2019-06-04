public class BurgerWorker1 implements Runnable {

    private Slider resource;

    public BurgerWorker1(Slider res){

        resource = res;
    }

    @Override
    public void run(){

        int newLevel = 0;
        while(true){
            newLevel = resource.addOne();
            System.out.println("Producer: " + newLevel);
            int pause = (int)(Math.random()*2000);
            try{
                Thread.sleep(pause);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}