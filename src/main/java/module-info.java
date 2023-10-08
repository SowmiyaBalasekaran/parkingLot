module com.example.parkinglot {
  requires javafx.controls;
  requires javafx.fxml;
  requires spring.data.mongodb;
  requires lombok;
  requires spring.context;
  requires spring.beans;
  requires spring.core;


  opens com.example.parkinglot to javafx.fxml;
  exports com.example.parkinglot;
}