package emulator.wekse.ua.Main;

import javax.swing.*;
import java.awt.*;

public class XMainWindow  extends JFrame{
    public XMainWindow()  {
        setupView();
        setupPanel();
        setVisible(true);}
        private void setupView(){

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
            Image image = new ImageIcon("logo.png").getImage();
            setIconImage(image);
        setTitle("Life Emulator");
        setExtendedState(JFrame.MAXIMIZED_BOTH) ;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.add(new XMainPanel());

        setVisible(true);


}
private void setupPanel(){
            add(new XMainPanel());

}
}
