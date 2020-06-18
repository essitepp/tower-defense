
package towerdefense.ui;
import java.io.FileInputStream;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.StageStyle;
import towerdefense.domain.Coordinates;

public class Ui extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        //side panel
        Button startButton = new Button("Start");
        ChoiceBox levelSelect = new ChoiceBox();
        levelSelect.getItems().add("level1");
        levelSelect.getItems().add("level2");
        levelSelect.getSelectionModel().selectFirst();
        
        VBox sidePane = new VBox(startButton, levelSelect);
        
        
        //top bar
//        FileInputStream coinInput = new FileInputStream("src/resources/images/coin.png");
        Image coinImage = new Image("file:src/resources/images/coin.png");
        ImageView coin = new ImageView(coinImage);
        Label moneyAmount = new Label("100");
        HBox money = new HBox(moneyAmount, coin);
        
        Label enemyText = new Label("Enemies left: ");
        Label enemyCount = new Label("20");
        HBox enemies = new HBox(enemyText, enemyCount);
        
        Label currentHealth = new Label("40");
        Label maxHealth = new Label("50");
        Label healthSeparator = new Label("/");
//        FileInputStream heartInput = new FileInputStream("src/resources/images/heart.png");
        Image heartImage = new Image("file:src/resources/images/heart.png");
        ImageView heart = new ImageView(heartImage);
        HBox health = new HBox(currentHealth, healthSeparator, maxHealth, heart);
        
        HBox topBar = new HBox(money, enemies, health);
        topBar.setSpacing(30);
        
        //game screen
        Pane gamePane = new Pane();
        gamePane.setPrefSize(640, 416);
        Image bgImage = new Image("file:src/resources/images/background.png");
        BackgroundImage bg = new BackgroundImage(bgImage, BackgroundRepeat.NO_REPEAT, 
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, 
                BackgroundSize.DEFAULT);
        Background background = new Background(bg);
        gamePane.setBackground(background);
        
        
        //temp
        ArrayList<Coordinates> pathList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            pathList.add(new Coordinates(i, 10));
        }
        
        
//        drawPath(path);
        Image pathImage = new Image("file:src/resources/images/path.png");
        for (Coordinates coordinates : pathList) {
            ImageView path = new ImageView(pathImage);
            path.setTranslateX(32*coordinates.getX());
            path.setTranslateY(32*coordinates.getY());
            gamePane.getChildren().add(path);
        }
        
        
        
        
        VBox gameLayout = new VBox(topBar, gamePane);
        
        
        HBox mainLayout = new HBox(sidePane, gameLayout);
        
        Scene mainScene = new Scene(mainLayout);
        
        stage.setScene(mainScene);
        stage.setTitle("Tower Defense");
//        stage.setWidth(800);
//        stage.setHeight(400);
        stage.show();
    }
    
    void drawPath(ArrayList<Coordinates> coordinateList) {
        
    }
    
//    public static void main(String[] args) {
//        launch(args);
//    }
    
    
    
    
}
