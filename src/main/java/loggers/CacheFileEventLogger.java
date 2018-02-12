package loggers;

import beans.Event;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AndrewUkraine on 30.01.2018.
 */
public class CacheFileEventLogger extends FileEventLogger {

    private int cacheSize;
    private List<Event> cache;

    public CacheFileEventLogger(String filename, int cacheSize) {
        super(filename);
        this.cacheSize = cacheSize;
        this.cache = new ArrayList<Event>(cacheSize);
    }
//метод уничтожает бин
    public void destroy() {
        if ( ! cache.isEmpty()) {
            writeEventsFromCache();
        }
        else writeEventsFromCache();
    }

    @Override
    public void  logEvent(Event event) {

        cache.add(event);

        if (cache.size() == cacheSize) {
            writeEventsFromCache();
            cache.clear();
        }
    }

    private void writeEventsFromCache() {
        for(Event e: cache) {
            super.logEvent(e);
        }
    }

}