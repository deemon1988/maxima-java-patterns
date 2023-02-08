package org.example.maximajavapatterns.observer;

import java.util.ArrayList;

public class Publisher implements Sender{
    private ArrayList<Receiver> subscribers = new ArrayList<>();
    private String name;
    private String data;
    @Override
    public void addSubscriber(Receiver receiver) {
        subscribers.add(receiver);
    }

    @Override
    public void removeSubscriber(Receiver receiver) {
        subscribers.remove(receiver);
    }

    @Override
    public void notifySubscribers() {
        for (Receiver sub: subscribers) {
            sub.sendNotification(this);
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getData() {
        return data;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(String data) {
        this.data = data;
        notifySubscribers();
    }

    public Publisher(String name, String data){
        this.name = name;
        this.data = data;
    }
}
