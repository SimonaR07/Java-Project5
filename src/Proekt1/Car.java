package Proekt1;

public class Car {


 // Приватни променливи на инстанцата
 private String make;
 private String model;
 private int year;

 // Дефолтен конструктор
 public Car() {
     this.make = " Unknown ";
     this.model = " Unknown ";
     this.year = 2023;
 }

 // Параметризиран конструктор
 public Car(String make, String model, int year) {
     this.make = make;
     this.model = model;
     this.year = year;
 }

 // Getter и Setter методи (по потреба)
 public String getMake() {
     return make;
 }

 public void setMake(String make) {
     this.make = make;
 }

 public String getModel() {
     return model;
 }

 public void setModel(String model) {
     this.model = model;
 }

 public int getYear() {
     return year;
 }

 public void setYear(int year) {
     this.year = year;
 }

 // Преоптоварување на методот toString() за погоден излез при печатење
 @Override
 
 public String toString() {
     return "Car{" +
             "make='" + make + '\'' +
             ", model='" + model + '\'' +
             ", year=" + year +
             '}';
 }
}


