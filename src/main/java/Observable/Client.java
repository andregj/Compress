package Observable;

import java.util.Observable;

public class Client {
  public static void main (String [] args) {
    DataStore observable = new DataStore();
    DataStoreObserver observer1 = new DataStoreObserver("Observer 1");
    DataStoreObserver observer2 = new DataStoreObserver("Observer 2");
    DataStoreObserver observer3 = new DataStoreObserver("Observer 3");
      
    observable.addObserver(observer1);
    observable.addObserver(observer2);
    observable.setData("Hello");
    System.out.println("Number of Observers " + observable.countObservers());
    
    observable.addObserver(observer3);
    observable.setData("Good Bye");
    System.out.println("Number of Observers " + observable.countObservers());
    
    observable.deleteObserver(observer2);
    observable.setData("Bye bye");
    System.out.println("Number of Observers " + observable.countObservers());
  }

}
