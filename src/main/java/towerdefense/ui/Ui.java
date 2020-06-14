
package towerdefense.ui;
import java.io.FileInputStream;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.StageStyle;

public class Ui extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //side panel
        Label levelTitle = new Label("[levelTitle]");
        Button startButton = new Button("Start");
        ChoiceBox levelSelect = new ChoiceBox();
        levelSelect.getItems().add("level1");
        levelSelect.getItems().add("level2");
        
        VBox sidePane = new VBox(levelTitle, startButton, levelSelect);
        
        
        //top bar
        FileInputStream coinInput = new FileInputStream("src/resources/images/coin.png");
        Image coinImage = new Image(coinInput);
        ImageView coin = new ImageView(coinImage);
        Label moneyAmount = new Label("100");
        HBox money = new HBox(moneyAmount, coin);
        
        Label enemyText = new Label("Enemies left: ");
        Label enemyCount = new Label("20");
        HBox enemies = new HBox(enemyText, enemyCount);
        
        Label currentHealth = new Label("40");
        Label maxHealth = new Label("50");
        Label healthSeparator = new Label("/");
        FileInputStream heartInput = new FileInputStream("src/resources/images/heart.png");
        Image heartImage = new Image(heartInput);
        ImageView heart = new ImageView(heartImage);
        HBox health = new HBox(currentHealth, healthSeparator, maxHealth, heart);
        
        HBox topBar = new HBox(money, enemies, health);
        topBar.setSpacing(30);
        
        
        
        
        VBox gameLayout = new VBox(topBar);
        
        
        HBox mainLayout = new HBox(sidePane, gameLayout);
        
        Scene mainScene = new Scene(mainLayout);
        
        stage.setScene(mainScene);
        stage.setTitle("Tower Defense");
        stage.setWidth(800);
        stage.setHeight(400);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    
    
}
