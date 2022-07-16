module ru.gb.shurupovs.javachat {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.gb.shurupovs.javachat to javafx.fxml;
    exports ru.gb.shurupovs.javachat;
}