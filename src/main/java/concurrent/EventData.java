package concurrent;

public class EventData {
    public void register(EventListener listener) {
        listener.doPrint();
    }
}
