package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class Controller {


    public Label unosBrojeva;
    public Button jednakoBtn=new Button("=");
    public Button plusBtn=new Button("+");
    public Button minusBtn;
    public Button putaBtn;
    public Button tackaBtn;
    public Button podjeljenoBt;
    public Button procenatBtn;
    public Button btn0;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;


 @FXML
    private SimpleStringProperty tekst;
    public Controller (){ //dodali smo konstruktor bez parametara
        tekst=new SimpleStringProperty("0");
    }

    public void unos(ActionEvent actionEvent) {
        System.out.println(unosBrojeva.getText());
        unosBrojeva.setText(unosBrojeva.getText());
    }


}
