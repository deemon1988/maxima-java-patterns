package org.example.maximajavapatterns.observer;

public interface Sender {
    void addSubscriber(Receiver receiver);
    void removeSubscriber(Receiver receiver);

    void notifySubscribers();
    String getName();
    String getData();
}
