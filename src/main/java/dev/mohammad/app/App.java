package dev.mohammad.app;

import io.javalin.Javalin;

public class App {
    private static int counter;

    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> config.enableCorsForAllOrigins());
        app.get("/hola", context -> {
            context.result("Hola this many requests have been handled byt tyhe server  "+ ++App.counter);

        });
        app.start();
    }
}
