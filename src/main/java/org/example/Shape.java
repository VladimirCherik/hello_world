package org.example;
interface Area {
    float area (float side);
}

public abstract class Shape {
    private String name;
    public abstract void printerShape();

    public String getName (){
        return name;
    }

}
