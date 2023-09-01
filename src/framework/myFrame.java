package framework;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {

    private static final int SCREEN_WIDTH = 1920;
    private static final int SCREEN_HEIGHT = 1080;
    private int frameWidth;
    private int frameHeight;
    private int frameCenterWidth;
    private int frameCenterHeight;
    private boolean bRunning;
    public myFrame(String name) {
        this.init(name);
    }
    public myFrame(int w, int h, String name) {
        this.init(w,h,name);
    }

    private void init(String name) {
        this.setFrameWidth(800);
        this.setFrameHeight(600);
        this.setFrameCenterWidth();
        this.setFrameCenterHeight();
        this.setRunning(true);
        this.setTitle(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(getFrameWidth(), getFrameHeight());
        this.setLocation(getFrameCenterWidth(), getFrameCenterHeight());
        this.getContentPane().setBackground(new Color(0.5f, 0.5f, 0.5f, 1.0f));
        this.setVisible(true);
    }
    private void init(int x, int y, String name) {
        this.setFrameWidth(x);
        this.setFrameHeight(y);
        this.setFrameCenterWidth();
        this.setFrameCenterHeight();
        this.setRunning(true);
        this.setTitle(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(getFrameWidth(), getFrameHeight());
        this.setLocation(getFrameCenterWidth(), getFrameCenterHeight());
    }

    public void update() {

    }

    public void render() {

    }

    public void clean() {

    }

    //Getters/Setters

    public void setRunning(boolean b) {
        this.bRunning = b;
    }
    public boolean getRunning() {
        return this.bRunning;
    }
    public void setFrameWidth(int x) {
        this.frameWidth = x;
    }
    public int getFrameWidth() {
        return this.frameWidth;
    }
    public void setFrameHeight(int y) {
        this.frameHeight = y;
    }
    public int getFrameHeight() {
        return this.frameHeight;
    }
    public void setFrameCenterWidth() {
        this.frameCenterWidth = (SCREEN_WIDTH / 2) - (getFrameWidth() / 2);
    }
    public int getFrameCenterWidth() {
        return this.frameCenterWidth;
    }
    public void setFrameCenterHeight() {
        this.frameCenterHeight = (SCREEN_HEIGHT / 2) - (getFrameHeight() / 2);
    }
    public int getFrameCenterHeight() {
        return this.frameCenterHeight;
    }
}