package org.example.maximajavapatterns.observer;

public class Subscriber implements Receiver{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void sendNotification(Sender sender) {
        System.out.println(
                String.format("Я, %s, получил оповещение от %s об %s, выполняю.",
                        getName(),
                        sender.getName(),
                        sender.getData())
        );
    }
}
