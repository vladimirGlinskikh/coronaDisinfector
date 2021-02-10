package kz.zhelezyaka;

public class Main {
    public static void main(String[] args) {
        CoronaDisinfect desinfector = new CoronaDisinfect();
        desinfector.start(new Room());
    }
}
