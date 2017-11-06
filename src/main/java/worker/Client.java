package worker;

public class Client {

  public static void main (String [] args) {
    Worker worker1 = new Worker();
    Superworker superWorker = new Superworker();
    
    Manager manager = new Manager ();
    manager.setWorker(worker1);
    manager.manage();
    manager.setWorker(superWorker);
    manager.manage();
    
    MiniWorker miniworker = new MiniWorker();
    manager.setWorker(miniworker);
    manager.manage();
  }
}
