package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import sample.Model.Player;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

public class Controller implements Initializable{

    @FXML
    public Button btnbuyApples;

    @FXML
    public Button btnbuyOranges;

    @FXML
    public Button btnbuyBananas;

    @FXML
    public Button btnbuyGrapes;

    @FXML
    public Text boxApples;

    @FXML
    public Text boxOranges;

    @FXML
    public Text boxBananas;

    @FXML
    public Text boxGrapes;

    @FXML
    public Text boxTimer;

    @FXML
    public Text priceText;

    @FXML
    public Text feedbackText;

    @FXML
    public Text playerCash;

    @FXML
    public Button btnSellApples;

    @FXML
    public Button btnSellOranges;

    @FXML
    public Button btnSellBananas;

    @FXML
    public Button btnSellGrapes;

    public int countApples = 0;
    public int countOranges = 0;
    public int countBananas = 0;
    public int countGrapes = 0;

    public int countTime = 0;
    public double price = 0.0;
    public double MIN = .01;
    public double MAX = 9.99;



    @Override
    public void initialize(URL location, ResourceBundle resources){


        updateBoxes();
        setUpClock();
    }

    public void setUpClock() {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                countTime++;
                String stringTime = String.valueOf(countTime);
                boxTimer.setText(stringTime);


            }
        };

        Player player = new Player(100, 0, 0, 0, 0);
        Timer moneyTimer = new Timer();
        moneyTimer.schedule(task, 1000L, 1000L);

        DecimalFormat df = new DecimalFormat("0.00");
        player.setCash(Double.parseDouble(df.format(player.getCash())));
        playerCash.setText("Player Cash: $" + String.valueOf(player.getCash()));

        Random priceAdusterApples = new Random(10 );
        double randomPriceApples = priceAdusterApples.nextDouble();
        priceText.setText(String.valueOf(randomPriceApples));



    }

    public void updateBoxes(){
        boxApples.setText("Apples: " + countApples);
        boxOranges.setText("Oranges: " + countOranges);
        boxBananas.setText("Bananas: " + countBananas);
        boxGrapes.setText("Grapes:" + countGrapes);

    }

    public void buyApples(ActionEvent actionEvent){
        countApples++;
        updateBoxes();
        feedbackText.setText(countApples + " " + "APPLE(S) PURCHASED");
    }
    public void buyOranges(ActionEvent actionEvent){
        countOranges++;
        updateBoxes();
        feedbackText.setText(countOranges + " " + "ORANGE(S) PURCHASED");
    }

    public void buyBananas(ActionEvent actionEvent){
        countBananas++;
        updateBoxes();
        feedbackText.setText(countBananas + " " + "BANANA(S) PURCHASED");
    }
    public void buyGrapes(ActionEvent actionEvent){
        countGrapes++;
        updateBoxes();
        feedbackText.setText(countGrapes + " " + "GRAPE(S) PURCHASED");
    }

    public void sellApples(ActionEvent actionEvent){
        if(countApples > 0){
            countApples--;
            updateBoxes();
            feedbackText.setText("SALE SUCCESSFUL");
        } else {
            feedbackText.setText("ERROR. CAN'T SELL MORE THAN YOU HAVE." );
        }

    }
    public void sellOranges(ActionEvent actionEvent){
        if(countOranges > 0){
            countOranges--;
            updateBoxes();
            feedbackText.setText("SALE SUCCESSFUL");
        } else {
            feedbackText.setText("ERROR. CAN'T SELL MORE THAN YOU HAVE." );
        }
    }
    public void sellBananas(ActionEvent actionEvent){
        if(countBananas > 0){
            countBananas--;
            updateBoxes();
            feedbackText.setText("SALE SUCCESSFUL");
        } else {
            feedbackText.setText("ERROR. CAN'T SELL MORE THAN YOU HAVE." );
        }
    }
    public void sellGrapes(ActionEvent actionEvent){
        if(countGrapes > 0){
            countGrapes--;
            updateBoxes();
            feedbackText.setText("SALE SUCCESSFUL");
        } else {
            feedbackText.setText("ERROR. CAN'T SELL MORE THAN YOU HAVE." );
        }
    }
}