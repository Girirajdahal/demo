package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class login_client extends Application {
    @Override
    public void start(Stage Stage2) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../resource/login.fxml"));
        Stage2.setTitle("All in one store");
        Stage2.setScene(new Scene(root,1500,820));
        Stage2.show();
    }


    public static void main(String[] args) { launch(args);}

}


