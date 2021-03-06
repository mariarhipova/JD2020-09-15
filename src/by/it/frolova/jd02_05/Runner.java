package by.it.frolova.jd02_05;

import java.util.Locale;

public class Runner {
    public static void main(String[] args) {
        Lang manager = Lang.INSTANCE;
        if (args.length == 2) {
            Locale locale = new Locale(args[0], args[1]);
            manager.setLocale(locale);
        } else {
            manager.setLocale(Locale.ENGLISH);
        }

        System.out.println(manager.get(Greeting.HELLO));
        System.out.println(manager.get(Greeting.QUESTION));
        System.out.println(manager.get(User.FIRST_NAME));
        System.out.println(manager.get(User.LAST_NAME));
    }
}
