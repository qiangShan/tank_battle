package com.mashibing.tank;

import java.awt.*;

/**
 * 坦克类
 * */

public class Tank {
    private int x,y;
    private static final int WIDTH=40;
    private static final int HEIGHT=40;
    private TankFrame tf=null;

    public Tank(int x, int y, TankFrame tf){
        this.x=x;
        this.y=y;
        this.tf=tf;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void paint(Graphics graphics){
        Color color = graphics.getColor();
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(x,y,WIDTH,HEIGHT);
        graphics.setColor(color);
    }
}
