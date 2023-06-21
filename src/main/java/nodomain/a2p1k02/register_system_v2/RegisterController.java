package nodomain.a2p1k02.register_system_v2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class RegisterController {
    @FXML
    private Label lblName;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnShow;

    @FXML
    private Button btnDel;

    @FXML
    private Button btnLogin;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnExp;

    @FXML
    private Button btnImp;

    @FXML
    private Button btnExit;

    @FXML
    protected void onBtnLoginClick() {

    }

    @FXML
    protected void onExit() {
        Stage stage = (Stage) btnExit.getScene().getWindow();
        stage.close();
    }
}