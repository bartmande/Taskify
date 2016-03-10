package grupaA.taskify;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *Główna klasa programu
 */
public class Taskify extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Metoda rozpoczynająca działanie programu
     * pierwszym widokiem jest Login
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/GUI/Login.fxml"));
        Scene scene = new Scene(root, 300, 275);

        primaryStage.setTitle("Taskify");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
