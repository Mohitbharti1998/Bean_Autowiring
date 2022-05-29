package org.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;
import java.util.TreeMap;

public class Triangle{

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle() {
    }

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", pointC=" + pointC +
                '}';
    }


/*    implements InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean init method called for triangle");
    }

    implements DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("Destroying beans");
    }*/

    public void myInit(){
        System.out.println("Init methos");
    }

    public void cleanUp(){
        System.out.println("Clean up");
    }
}
