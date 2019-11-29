package com.company;

public abstract  class Figure {
  protected   float x;
    protected float y;
    public Figure (float xx, float yy){
        this.x=xx;
        this.y=yy;
    }
    abstract float getArea();
    abstract float getPerimeter();
}
