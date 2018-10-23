package tsi.stanislaw.cab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
	    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = FXMLLoader.load(getClass().getResource("/tsi/stanislaw/cab/Main.fxml"));

        Scene scene = new Scene(root, 500,300);
        primaryStage.setTitle("Cows and Bulls");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
