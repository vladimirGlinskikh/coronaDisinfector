package kz.zhelezyaka;

public class ConsoleAnnouncer implements Announcer {
    private Recommendator recomendator = ObjectFactory.getInstance().createObject(Recommendator.class);
    @Override
    public void announce(String message) {
        System.out.println(message);
        recomendator.recommend();
    }
}