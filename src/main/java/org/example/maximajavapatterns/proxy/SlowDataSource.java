package org.example.maximajavapatterns.proxy;

public class SlowDataSource implements DataSource{
    private String data;
    @Override
    public String getData() throws Exception {
        System.out.println("Получение данных");
        Thread.sleep(2000);
        System.out.print(".");
        Thread.sleep(2000);
        System.out.print(".");
        Thread.sleep(2000);
        System.out.print(".");
        Thread.sleep(2000);
        return data;
    }

    @Override
    public void setData(String data) {
        this.data=data;
    }

    public SlowDataSource(String data) {
        this.data = data;
    }
}
