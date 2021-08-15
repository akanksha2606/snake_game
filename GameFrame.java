import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    GameFrame(){
        this.add( new GamePanel());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        // this.setResizable(false);
        this.pack();
        this.setSize(600,600);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}
