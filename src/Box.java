public class Box<T> {
  // Object is the superclass of all classes in Java
  // Generic type
  private Object content;
  // T is a placeholder for the type that will be passed to the Box class
  private T genericContent;

  // Getters and Setters for the generic content
  public Object getContent() {
    return content;
  }
  public void setContent(Object content) {
    this.content = content;
  }

  // Getters and Setters for T generic content
  public T getGenericContent() {
    return genericContent;
  }
  public void setGenericContent(T genericContent) {
    this.genericContent = genericContent;
  }
  @Override
  public String toString() {
    return "Box [content=" + content + ", genericContent=" + genericContent + "]";
  }
  
}
