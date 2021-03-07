package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    private HBox hBox;
    private VBox vBox;
    private Button btn1, btn2, btn3, btn4,btn5,btn6,btn7;
    private Label lbl1,lbl2,lbl3;
    private BorderPane Bp;
    private FlowPane Fp;
    private GridPane Gp;
    private AnchorPane Ap;


    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));


        /*FlowPane flow = new FlowPane(Orientation.VERTICAL);
        flow.getChildren().addAll(new Button("PUSH"), new Button("PUSH 2"), new Button("PUSH 3"));


        Scene scene = new Scene(flow,400,70);

        primaryStage.setTitle("Practica 1 - Topicos");
        primaryStage.setScene(scene);
        primaryStage.show();*/
        //CrearAP();
        CrearGP();
        //CrearFl();
        //CrearBP();
        //CrearUI();
        primaryStage.setTitle("Practica 1- Topicos");
        primaryStage.setScene(new Scene(Gp, 600, 450));
        primaryStage.show();
    }

    /*private void CrearAP() {

        Ap = new AnchorPane();
        btn1 = new Button("Boton 1");
        btn2 = new Button("Boton 2");
        btn1.setMaxSize(300, 200);
        btn2.setMaxSize(300, 200);
        btn1.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        btn2.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");

        Ap.setTopAnchor(btn1,15.0);
        Ap.setRightAnchor(btn1,15.0);
        Ap.setBottomAnchor(btn2,30.0);
        Ap.setLeftAnchor(btn2,100.0);

        Ap.getChildren().addAll(btn1, btn2);
    }*/

    private void CrearGP() {

        Gp = new GridPane();
        btn1 = new Button( "Posicion 0,0");
        btn2 = new Button( "Posicion 1,0");
        btn3 = new Button( "Posicion 0,1");
        btn4 = new Button( "Posicion 1,1");
        btn5 = new Button( "Posicion 0,2");
        btn6 = new Button( "Posicion 1,2");
        btn7 = new Button( "Posicion col 2 fila 2");
        btn1.setMaxSize(300, 200);
        btn2.setMaxSize(300, 200);
        btn3.setMaxSize(300, 200);
        btn4.setMaxSize(300, 200);
        btn5.setMaxSize(300, 200);
        btn6.setMaxSize(300, 200);
        btn7.setMaxSize(300, 200);
        btn1.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        btn2.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        btn3.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        btn4.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        btn5.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        btn6.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        btn7.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        Gp.add(btn1, 0, 0);
        Gp.add(btn2, 1, 0);
        Gp.add(btn3, 0, 1);
        Gp.add(btn4, 1, 1);
        Gp.add(btn5, 0, 2);
        Gp.add(btn6, 1, 2);
        Gp.add(btn7, 2, 2);



    }


    /* private void CrearFl() {

        btn1 = new Button( "PUSH");
        btn2 = new Button( "PUSH ");
        btn3 = new Button( "PUSH");
        btn1.setMaxSize(300, 200);
        btn2.setMaxSize(300, 200);
        btn3.setMaxSize(300, 200);
        btn1.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        btn2.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        btn3.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");


        Fp = new FlowPane(Orientation.VERTICAL);
        Fp.getChildren().addAll(btn1, btn2, btn3);
    }*/

    /*private void CrearBP() {
        //TOP
        btn1 = new Button( "PUSH");
        btn2 = new Button( "PUSH ");
        //LEFT
        btn3 = new Button( "PUSH");
        btn4 = new Button( "PUSH ");
        //RIGHT
        lbl1 = new Label("PUSH");
        //BOTTOM
        lbl2 = new Label( "PUSH");
        //CENTER
        lbl3 = new Label("PUSH");

        btn1.setMaxSize(300, 200);
        btn2.setMaxSize(300, 200);
        btn3.setMaxSize(300, 200);
        btn4.setMaxSize(300, 200);
        btn1.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        btn2.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        btn3.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        btn4.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");

        lbl1.setFont(new Font(20));
        lbl2.setFont(new Font(20));
        lbl3.setFont(new Font(20));

        hBox = new HBox();
        vBox = new VBox();
        Bp = new BorderPane();

        hBox.getChildren().addAll(btn1, btn2);
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        vBox.getChildren().addAll(btn3,btn4);
        vBox.setSpacing(10);
        vBox.setAlignment(Pos.CENTER);



        Bp.setTop(hBox);
        Bp.setRight(lbl1);
        Bp.setBottom(lbl2);
        Bp.setLeft(vBox);
        Bp.setCenter(lbl3);


    }*/

    /*private void CrearUI() {
        BorderPane bPane = new BorderPane();
        bPane.setTop(new TextField("Top"));
        bPane.setBottom(new TextField("Bottom"));

        btn1 = new Button( "PUSH");
        btn2 = new Button( "PUSH ");
        btn3 = new Button( "PUSH ");
        btn1.setMaxSize(300, 200);
        btn2.setMaxSize(300, 200);
        btn3.setMaxSize(300, 200);
        btn1.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        btn2.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");
        btn3.setStyle("-fx-border-color: #000000; -fx-border-width: 2px; -fx-background-color: #F0FFFF");

        hBox = new HBox();
        vBox = new VBox();

        hBox.getChildren().addAll(btn1, btn2, btn3 );
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(20));


        vBox.getChildren().addAll(btn1, btn2, btn3);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(20));

     }*/


    public static void main(String[] args) {
        launch(args);
    }
    }