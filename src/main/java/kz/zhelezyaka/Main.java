package kz.zhelezyaka;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final ApplicationContext context = Application.run("kz.zhelezyaka", new HashMap<>(Map.of(Policeman.class, PolicemanImpl.class)));
        final CoronaDisinfect desinfector = context.getObject(CoronaDisinfect.class);
        desinfector.start(new Room());
    }
}
