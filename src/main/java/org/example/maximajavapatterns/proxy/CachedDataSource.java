package org.example.maximajavapatterns.proxy;

public class CachedDataSource implements DataSource{
    private SlowDataSource source;
    private String cache;
    private boolean isCached;

    public CachedDataSource(String cache) {
        this.source = new SlowDataSource(cache);
        this.cache = cache;
        this.isCached = true;
    }

    @Override
    public String getData() throws Exception {
        if (!isCached){
            cache = source.getData();
            isCached = true;
        }
        return cache;
    }

    @Override
    public void setData(String data) {
        this.source.setData(data);
        this.isCached = false;
    }
}
