package com.instead.tax.annotation;
public class Position {
    private double x, y, width, height;
    public Position() {}
    public Position(double x, double y, double width, double height) {
        this.x=x; this.y=y; this.width=width; this.height=height;
    }
    public double getX(){return x;} public void setX(double v){x=v;}
    public double getY(){return y;} public void setY(double v){y=v;}
    public double getWidth(){return width;} public void setWidth(double v){width=v;}
    public double getHeight(){return height;} public void setHeight(double v){height=v;}
}
