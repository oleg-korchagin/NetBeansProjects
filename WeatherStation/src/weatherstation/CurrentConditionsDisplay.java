package weatherstation;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;
    
    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    public void update(float t, float h, float p) {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
        display();
    }
    
    public void display() {
        System.out.println("Temperature: " + temperature + 
            " Humidity: " + humidity +
            " Pressure: " + pressure);
    }
}