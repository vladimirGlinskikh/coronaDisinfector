package kz.zhelezyaka;

public class PolicemanImpl implements Policeman {
    @InjectByType
    private Recommendator recommendator;

    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("пиф паф, кыш отсюда!");
    }
}
