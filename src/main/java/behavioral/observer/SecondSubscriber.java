package com.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class SecondSubscriber implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println("SecondSubscriber deal is:"+(String)arg);
    }
}