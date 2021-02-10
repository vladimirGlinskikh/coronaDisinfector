package kz.zhelezyaka;

public class CoronaDisinfect {
    private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

    public void start(Room room) {
        announcer.announce("Начинаем дезинфекцию, все вышли!");
        policeman.makePeopleLeaveRoom();
        disinfect(room);
        announcer.announce("Заходите обратно!");
    }

    private void disinfect(Room room) {
        System.out.println("Зачитывается молитва: 'корона изыди!' - молитва прочитана, вирус убит!");
    }


}
