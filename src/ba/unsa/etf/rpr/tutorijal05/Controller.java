package ba.unsa.etf.rpr.tutorijal05;


import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {

    boolean decimalni=false;
    int cifra;
    double broj1;
    int intVr=0;
    double doubleVr=0;
    String trenutniBroj="";
    public Label display;
    boolean kucano=false;
    private SimpleStringProperty tekst;
    public Button btn0;


    public Controller() {
        tekst = new SimpleStringProperty("0");
    }
    public String getTekst() {
        return tekst.get();
    }
    public SimpleStringProperty tekstProperty() {
        return tekst;
    }
    public void setTekst(String tekst) {
        this.tekst.set(tekst);
    }
    public void zeroClick(ActionEvent actionEvent) {
        if (tekst.get().equals("0") && tekst.get().length() == 1) {
            tekst.set(btn0.getText());
        } else {
            tekst.set(tekst.get() + btn0.getText());

        }

    }
    public void oneClick(ActionEvent actionEvent ){}
    public void twoClick(ActionEvent actionEvent ){}
    public void threeClick(ActionEvent actionEvent ){}
    public void fourClick(ActionEvent actionEvent ){}
    public void fiveClick(ActionEvent actionEvent ){}
    public void sixClick(ActionEvent actionEvent ){}
    public void sevenClick(ActionEvent actionEvent){}
    public void eightClick(ActionEvent actionEvent ){}
    public void nineClick(ActionEvent actionEvent ){}
    public void dotBtn(ActionEvent actionEvent){
        decimalni=true;
    }
    void DodajCifru(int broj){
        trenutniBroj+=(""+broj);
        if(!decimalni) doubleVr = Double.parseDouble(trenutniBroj);
        else doubleVr=Double.parseDouble(trenutniBroj);
        display.setText(trenutniBroj);
        kucano=true;
    }


}
