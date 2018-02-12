package loggers;

import beans.Event;

import java.util.Collection;

/**
 * Created by AndrewUkraine on 02.02.2018.
 */
public class CombinedEventLogger implements EventLogger {

    private final Collection<EventLogger> loggers;

    public CombinedEventLogger(Collection<EventLogger> loggers) {
        this.loggers = loggers;
    }


    @Override
    public void logEvent(Event event) {
        for (EventLogger eventLogger : loggers) {
            eventLogger.logEvent(event);
        }
    }

}