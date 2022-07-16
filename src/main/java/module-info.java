module ru.gb.shurupova.javachat {
    requires javafx.controls;
    requires javafx.fxml;


    exports ru.gb.shurupova.javachat.client;
    opens ru.gb.shurupova.javachat.client to javafx.fxml;
}