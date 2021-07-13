package dev.mohammad.app;

import io.javalin.Javalin;

public class App {
    private static int counter;

    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> config.enableCorsForAllOrigins());
        app.get("/hola", context -> {
            context.result("HOLA/HELLO/SALAM this many requests have been handled by this server"+
                           "version 5.00 with a webhook able to automatically build successfully thank you mohammad "+ ++App.counter);

        });
        app.start();
    }
}
