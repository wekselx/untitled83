package emulator.wekse.ua.Main;

import emulator.wekse.ua.Cell.XCellInfoPanel;
import emulator.wekse.ua.Map.XMapInfoPanel;
import emulator.wekse.ua.Map.XMapPanel;
import emulator.wekse.ua.Panel.XControlPanel;
import emulator.wekse.ua.Panel.XEventsInfoPanel;

import javax.swing.*;
import java.awt.*;

public class XMainPanel extends JPanel {

    public static JPanel leftgroupPanel;
    public static JPanel centergroupPanel;
    public static JPanel rightgroupPanel;
    public static XMapInfoPanel mapInfoPanel;
    public static XEventsInfoPanel eventsInfoPanel;
    public static XMapPanel mapPanel;
    public static XControlPanel controlPanel;
    public static XCellInfoPanel cellInfoPanel;



    public  XMainPanel(){
    setupView();
setupGroupPanels();
setupMapInfoPanel();
setupEventsInfoPanel();
setupMapPanel();
setupControlPanel();
setupCellInfoPanel();


    setVisible(true);

}
private void  setupView(){
    setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
}
private void setupGroupPanels(){
leftgroupPanel=new JPanel();
leftgroupPanel.setLayout(new BoxLayout(leftgroupPanel,BoxLayout.Y_AXIS));
add(leftgroupPanel);

centergroupPanel=new JPanel();
centergroupPanel.setLayout(new BoxLayout(centergroupPanel,BoxLayout.Y_AXIS));
add(centergroupPanel);

rightgroupPanel=new JPanel();
rightgroupPanel.setLayout(new BoxLayout(rightgroupPanel,BoxLayout.Y_AXIS));
add(rightgroupPanel);
}
private void setupMapInfoPanel(){
    mapInfoPanel=new XMapInfoPanel();
    leftgroupPanel.add(mapInfoPanel);
}
private void setupEventsInfoPanel(){
    eventsInfoPanel=new XEventsInfoPanel();
    leftgroupPanel.add(eventsInfoPanel);

}
private void setupMapPanel(){
    centergroupPanel.add(Box.createRigidArea(new Dimension(0, 5)));
    mapPanel=new XMapPanel();
    centergroupPanel.add(mapPanel);
}
private void setupControlPanel(){
    controlPanel=new XControlPanel();
    centergroupPanel.add(controlPanel);
}
private void setupCellInfoPanel(){
    cellInfoPanel=new XCellInfoPanel();
    rightgroupPanel.add(cellInfoPanel);
}

}
