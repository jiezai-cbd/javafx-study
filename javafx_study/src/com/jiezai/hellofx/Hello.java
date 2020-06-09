package com.jiezai.hellofx;

import com.sun.scenario.effect.impl.prism.PrImage;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Hello extends Application {
    public static void main(String[] args) {
        System.out.println("HELLO WORLD");

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX");
        primaryStage.getIcons().add(new Image("/icon/application.png"));
        //primaryStage.setIconified(true);//设置最小化
        //primaryStage.setMaximized(true);//设置最大化
        //primaryStage.close();//关闭
//        primaryStage.setX(100);
//        primaryStage.setY(100);
//        primaryStage.setWidth(500);
//        primaryStage.setHeight(500);
        //primaryStage.setResizable(true);
//        primaryStage.setMaxHeight(800);
//        primaryStage.setMaxWidth(800);
//        primaryStage.setMinHeight(300);
//        primaryStage.setMinWidth(300);System.out.println("width:" + primaryStage.getWidth());
//        System.out.println("height:" + primaryStage.getHeight());


//        primaryStage.heightProperty().addListener(new ChangeListener<Number>(){
//            @Override
//            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//                System.out.println("height:"+newValue.doubleValue());
//            }
//        });
//
//        primaryStage.widthProperty().addListener(new ChangeListener<Number>(){
//            @Override
//            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//                System.out.println("width:"+newValue.doubleValue());
//            }
//        });
//        primaryStage.xProperty().addListener(new ChangeListener<Number>(){
//            @Override
//            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//                System.out.println("x:"+newValue);
//            }
//        });
//        primaryStage.yProperty().addListener(new ChangeListener<Number>(){
//            @Override
//            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
//                System.out.println("y:"+newValue);
//            }
//        });
//        primaryStage.setFullScreen(true);
//
//        primaryStage.setScene(new Scene(new Group()));
//        primaryStage.setOpacity(0.5);
        //primaryStage.setAlwaysOnTop(true);
//        Stage s1 = new Stage();
//        s1.setTitle("s1");
//        s1.initStyle(StageStyle.DECORATED);
//        s1.show();
//
//        Stage s2 = new Stage();
//        s2.setTitle("s2");
//        s2.initStyle(StageStyle.TRANSPARENT);
//        s2.show();

//        Stage s3 = new Stage();
//        s3.setTitle("s3");
//        s3.initStyle(StageStyle.UNDECORATED);
//        s3.show();

//        Stage s4 = new Stage();
//        s4.setTitle("s4");
//        s4.initStyle(StageStyle.UNIFIED);
//        s4.show();
//
//        Stage s5 = new Stage();
//        s5.setTitle("s5");
//        s5.initStyle(StageStyle.UTILITY);
//        s5.show();
        /*how()方法之后设置默认的宽高，因此如果没有收动设置宽高，
        需要在show（)方法之后获取宽高，否则获取不到*/
        //primaryStage.show();



    }
}
