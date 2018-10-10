package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class FirstSubscriber implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println("FirstSubscriber deal is:"+(String)arg);
    }
}