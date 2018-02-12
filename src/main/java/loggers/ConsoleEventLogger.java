package loggers;

import beans.Event;

/**
 * Created by AndrewUkraine on 30.01.2018.
 */
public class ConsoleEventLogger implements EventLogger {


   /* public void logEvent(String msg) {
        System.out.println(msg);
    }*/

    @Override
    public void logEvent(Event event) {
        System.out.println(event);
    }
}
