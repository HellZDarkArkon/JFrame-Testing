import framework.myFrame;


public class Main {
    public static void main(String[] args) {
        myFrame frame = new myFrame(800,600, "JFrame testing");

        while(frame.getRunning()) {
            frame.update();
            frame.render();
        }
        frame.clean();

    }
}