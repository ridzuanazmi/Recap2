public class Car implements Startable{

  private String color;
  private boolean isStarted;

  // Constructors
  public Car(String color, boolean isStarted) {
    this.color = color;
    this.isStarted = isStarted;
  }
  // Default constructor
  public Car() {}

  // Getters and Setters AKA Accessors and Mutators
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public boolean isStarted() {
    return isStarted;
  }

  public void setStarted(boolean isStarted) {
    this.isStarted = isStarted;
  }

  // Behavior of the car
  public void start() {
    isStarted = true;
  }

  public void stop() {
    isStarted = false;
  }

  @Override
  public String toString() {
    return "Car [color=" + color + ", isStarted=" + isStarted + "]";
  }

}
