package kz.zhelezyaka;

@Deprecated
public class CoronaDisinfect {

    @InjectByType
    private Announcer announcer;
    @InjectByType
    private Policeman policeman;

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
