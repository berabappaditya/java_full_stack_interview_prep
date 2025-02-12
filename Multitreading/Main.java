
class NumberPrinter implements Runnable {
    int number;
    NumberPrinter(int number){
        this.number = number;
    }
    @Override
    public void run(){
        System.out.println("Printing "+number + " from "+Thread.currentThread().getName());
    }
}
public class Main {
    public static void main(String[] args) {
        // for(int i=0; i<999999;i++){
        //    Thread t = new Thread(new NumberPrinter(i));
        //    t.start();
        // }

        // Runnable r = ()->{
        //     int i =5;
        //     while(i<100){
        //         System.out.println(i++);
        //         System.err.println("Current Thread number"+Thread.currentThread().getName());
        //     }
        // };


        // r.run();

        Thread t = new Thread(new Runnable(){
            @Override
            public void run() {
            }
        });

        Runnable runnable = () -> System.out.println("Hello");
        runnable.start();
        // Thread t = new Thread(r);
        // Thread t1 = new Thread(r); 
        // Thread t2 = new Thread(r);
        // t.start();
        // t1.start();
        // t2.start();
    }
}
