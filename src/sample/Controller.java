package sample;


import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class Controller {
    public Button btnMain;
    int clickCounter = 0;

    public void onBtnAction(ActionEvent actionEvent){
        System.out.println("Kliknięcie nr " + ++clickCounter);
        if(clickCounter == 1){
            btnMain.setText("I jeszcze raz");
        }
    }
}
