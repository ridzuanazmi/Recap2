public class FlyingCar extends Car {
  // Derived class can extend the base class by adding new fields and methods

  private int altitude = 0;
  private boolean isFlying;

  // Polymorphism & Overloading: Same method name, different parameters
  // 2 Constructors to give instantiation options
  // Polymorphic constructor
  public FlyingCar() { }
  public FlyingCar (String color) { this.setColor(color); }

  // Polymorphism & Overriding: Same method name, same parameters
  // Overriding the getColor method from the parent class
  // Annotation @Override is optional but recommended to declare that this method is overriding the parent class method
  // Same method signature as the parent class
  // Specify more specific or different behavior for the FlyingCar class compared to the Car class
  @Override
  public String getColor() {
    return String.format("Matte %s", super.getColor()); // super keyword to access the parent class as color is private
  }
  
  public int getAltitude() {
    return altitude;
  }
  public void setAltitude(int altitude) {
    this.altitude = altitude;
  }
  public boolean isFlying() {
    return isFlying;
  }
  public void setFlying(boolean isFlying) {
    this.isFlying = isFlying;
  }
  // New behavior for the FlyingCar
  // Method Overloading: Same method name, different parameters
  // Polymorphic method
  public void climb(int height) {
    isFlying = true;
    this.altitude += height;
  }
  public void climb() {
    this.climb(1000);
  }
}
