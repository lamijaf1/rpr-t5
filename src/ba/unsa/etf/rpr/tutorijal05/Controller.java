package ba.unsa.etf.rpr.tutorijal05;


import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;


public class Controller {

    public boolean decimalni = false;
    public Label display;
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
    public Button dotBtn;
    public Button plusBtn;
    public Button productBtn;
    public Button equalsBtn;
    public Button percentBtn;
    private String prviBroj="";
    private String drugiBroj="";
    private String minus="";
    private String product="";
    private  String divide="";
    private SimpleStringProperty tekst;

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

    public void zeroClick(ActionEvent actionEvent) { DodajCifru(0);}
    public void oneClick(ActionEvent actionEvent) { DodajCifru(1);}
    public void twoClick(ActionEvent actionEvent) { DodajCifru(2); }
    public void threeClick(ActionEvent actionEvent) { DodajCifru(3); }
    public void fourClick(ActionEvent actionEvent) { DodajCifru(4); }
    public void fiveClick(ActionEvent actionEvent) { DodajCifru(5); }
    public void sixClick(ActionEvent actionEvent) { DodajCifru(6); }
    public void sevenClick(ActionEvent actionEvent) { DodajCifru(7); }
    public void eightClick(ActionEvent actionEvent) { DodajCifru(8); }
    public void nineClick(ActionEvent actionEvent) { DodajCifru(9);}
    public void dotBtn(ActionEvent actionEvent) {
        if(decimalni==false)tekst.set(tekst.get()+dotBtn.getText());
        decimalni=true;
    }
    public void plusBtn(ActionEvent actionEvent) {
        prviBroj=tekst.get();
        //prviBroj=tekst.get()+plusBtn.getText();
        tekst.set("");
    }
    public void minusBtn(ActionEvent actionEvent) {
        minus=tekst.get();
        tekst.set("");
    }
    public void productBtn(ActionEvent actionEvent) {
        product=tekst.get();
        tekst.set("");
    }
    public void divideBtn(ActionEvent actionEvent) {
        divide=tekst.get();
        tekst.set("");
    }
    public void equalsBtn(ActionEvent actionEvent) {
        drugiBroj=tekst.get();
        String broj="";
        double br2=Double.parseDouble((drugiBroj));
        if(prviBroj!="") {
            double br1 = Double.parseDouble(prviBroj);
            double jednako = br1 + br2;
            broj = Double.toString(jednako);
        }
        if(minus!="") {
            double br1 = Double.parseDouble(minus);
            double jednako = br1 - br2;
            broj = Double.toString(jednako);
        }
        if(product!="") {
            double br1 = Double.parseDouble(product);
            double jednako = br1*br2;
            broj = Double.toString(jednako);
        }
        if(divide!="") {
            double br1 = Double.parseDouble(divide);
            double jednako = br1/br2;
            broj = Double.toString(jednako);
        }
        tekst.set(broj);
    }
    public void percentBtn(ActionEvent actionEvent) {
        String posto=tekst.get();
        tekst.set(tekst.get()+percentBtn.getText());
        double br1=Double.parseDouble(posto);
        br1/=100;
        posto=Double.toString(br1);
        tekst.set(posto);
    }
    void DodajCifru(int broj) {
        if (tekst.get().equals("0") && tekst.get().length() == 1) {
            if(broj==0)tekst.set(btn0.getText());
            else if (broj == 1) tekst.set(btn1.getText());
            else if (broj == 2) tekst.set(btn2.getText());
            else if (broj == 3) tekst.set(btn3.getText());
            else if (broj == 4) tekst.set(btn4.getText());
            else if (broj == 5) tekst.set(btn5.getText());
            else if (broj == 6) tekst.set(btn6.getText());
            else if (broj == 7) tekst.set(btn7.getText());
            else if (broj == 8) tekst.set(btn8.getText());
            else tekst.set(btn9.getText());
        } else {
            if (broj==0 ) tekst.set(tekst.get() + btn0.getText());
            else if (broj == 1) tekst.set(tekst.get() + btn1.getText());
            else if (broj == 2) tekst.set(tekst.get() + btn2.getText());
            else if (broj == 3) tekst.set(tekst.get() + btn3.getText());
            else if (broj == 4) tekst.set(tekst.get() + btn4.getText());
            else if (broj == 5) tekst.set(tekst.get() + btn5.getText());
            else if (broj == 6) tekst.set(tekst.get() + btn6.getText());
            else if (broj == 7) tekst.set(tekst.get() + btn7.getText());
            else if (broj == 8) tekst.set(tekst.get() + btn8.getText());
            else tekst.set(tekst.get() + btn9.getText());
        }

    }
}

