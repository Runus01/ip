package elsa.gui;

import javafx.application.Application;

/**
 * A launcher class to workaround classpath issues.
 *
 * @author Aaron
 */
public class Launcher {
    public static void main(String[] args) {
        Application.launch(Gui.class, args);
    }
}
