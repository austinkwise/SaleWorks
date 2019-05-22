package main;

import javafx.fxml.FXML;

import java.io.IOException;

public class SignInController {
    private SaleWorks mySw;

    public void setupSignIn(SaleWorks mySw){
        this.mySw = mySw;
    }

    @FXML private void signUpClick() throws IOException {
        mySw.showSignUp();
    }

    @FXML private void signInClick() throws IOException {
        mySw.showMainPage();
    }
}
