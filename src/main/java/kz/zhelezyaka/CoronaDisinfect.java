package kz.zhelezyaka;

public class CoronaDisinfect {
    private Announcer announcer = new ConsoleAnnouncer();
    private Policeman policeman = new PolicemanImpl();

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
