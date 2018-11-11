package ba.unsa.etf.rpr.tutorijal05;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;



public class Controller {


    public Label display;



 @FXML
    private SimpleStringProperty tekst;
    public Controller (){ //dodali smo konstruktor bez parametara
        tekst=new SimpleStringProperty("0");
    }

    public void zeroClick(ActionEvent actionEvent) {
    }
    public void oneClick(ActionEvent actionEvent ){
    }
    public void twoClick(ActionEvent actionEvent ){}
    public void threeClick(ActionEvent actionEvent ){}
    public void fourClick(ActionEvent actionEvent ){}
    public void fiveClick(ActionEvent actionEvent ){}
    public void sixClick(ActionEvent actionEvent ){}
    public void sevenClick(ActionEvent actionEvent){}
    public void eightClick(ActionEvent actionEvent ){}
    public void nineClick(ActionEvent actionEvent ){}
}
