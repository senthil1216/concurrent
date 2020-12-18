package concurrent;

public class Source {
    public int value = 1000;
    private final EventListener listener;

    private Source() {
        listener = new EventListener() {
            @Override
            public void doPrint() {
                System.out.println("hello world");
            }
        };
    }

    public static Source newInstance(EventData data) {
        Source src = new Source();
        data.register(src.listener);
        return src;
    }
}
