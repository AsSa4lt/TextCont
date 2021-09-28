package com.gmail.st1tchqwerty;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.*;

@Retention(value = RetentionPolicy.RUNTIME)
@interface SaveTo {

    String path();
}

@Retention(value = RetentionPolicy.RUNTIME)
@interface Saver {
}

@SaveTo(path = "C:\\Users\\admin\\Desktop\\Java\\Java V2.0\\TextCont\\file.txt")
public class TextContainer {
    private static final String text="Lohlohlohlohlohlohloh";
    @Saver
    public static void save(String path) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(text);
            System.out.println("Saving: DONE");
        } catch (IOException ex) {
            System.out.println("Saving: ERROR - " + ex.getMessage());
        }
    }
}
