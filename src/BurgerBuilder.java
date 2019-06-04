public class BurgerBuilder {

    public static void main(String[] args) {


      new BurgerBuilder();
    }

    public BurgerBuilder(){
        Slider resource = new Slider(2);
        Thread BurgerWorker2Thread = new Thread(new BurgerWorker2(resource));
        BurgerWorker2Thread.start();
        Thread BurgerWorker1Thread = new Thread(new BurgerWorker1(resource));
        BurgerWorker1Thread.start();
    }
}

