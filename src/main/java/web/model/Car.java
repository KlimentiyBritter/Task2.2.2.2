package web.model;

public class Car {
    private String model;
    private String colour;
    private int year;
    public Car(){}
    public Car(String model, String colour, int year) {
        this.model = model;
        this.colour = colour;
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car {" +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                '}';
    }
}
