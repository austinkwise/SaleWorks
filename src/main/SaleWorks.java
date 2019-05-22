package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SaleWorks extends Application {
    private Stage stage;

    @Override
    public void start(Stage stage) throws Exception{
        this.stage = stage;
        showSignIn();
    }

    public void showSignIn() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/SignIn.fxml"));
        GridPane pane = loader.load();

        SignInController controller = loader.getController();
        controller.setupSignIn(this);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    public void showSignUp() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/SignUp.fxml"));
        GridPane pane = loader.load();

        SignUpController controller = loader.getController();
        controller.setupSignUp(this);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    public void showMainPage() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/fxml/MainPage.fxml"));
        GridPane pane = loader.load();

        MainPageController controller = loader.getController();
        controller.setupMainPage(this);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
