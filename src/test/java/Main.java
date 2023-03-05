import com.mashibing.tank.TankFrame;

public class Main {
    public static void main(String[] args) {
        TankFrame tf = TankFrame.getInstance();

        while(true){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tf.repaint();
        }
    }
}
