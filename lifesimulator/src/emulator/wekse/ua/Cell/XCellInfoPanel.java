package emulator.wekse.ua.Cell;

import Ucf.veksel.ua.XUcfCoder;
import emulator.wekse.ua.Logistic.XFormatter;
import emulator.wekse.ua.Main.XMainPanel;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class XCellInfoPanel extends JPanel {

    private JLabel info;

    public XCellInfoPanel() {
        setupView();
        setupInfo();
        setVisible(true);
    }

    public void update(int y, int x) {
        long cellData = XMainPanel.mapPanel.getRawDataAt(y, x);
        String info = String.format("<html>Landscape type: %s"
                        + "<br> "
                        + "<br> Human type: %s"
                        + "<br> Human age: %s"
                        + "<br> Human energy: %s"
                        + "<br> Human satiety: %s"
                        + "<br> Human pregnancy: %s"

                        + "<br> "
                        + "<br> Plant type: %s"
                        + "<br> Plant fruits: %s"

                        + "<br> "
                        + "<br> Active flag (Human): %s"
                        + "<br> Active flag (Plant): %s</html>",

                XUcfCoder.decodeLandscapeType(cellData),
                XUcfCoder.decodeHumanType(cellData),
                XFormatter.formatDate(XUcfCoder.decodeHumanAge(cellData)),
                XUcfCoder.decodeHumanEnergy(cellData),
                XUcfCoder.decodeHumanSatiety(cellData),
                XFormatter.formatDate(XUcfCoder.decodeHumanPregnancy(cellData)),
                XUcfCoder.decodePlantType(cellData),
                XUcfCoder.decodePlantFruits(cellData),
                XUcfCoder.decodeActiveFlagHuman(cellData),
                XUcfCoder.decodeActiveFlagPlant(cellData));
        this.info.setText(info);
        this.setToolTipText(XFormatter.formatRaw(cellData));
    }

    public void reset() {
        this.info.setText("-");
        this.setToolTipText(null);
    }

    private void setupView() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBorder(new TitledBorder("Cell Info"));
        setPreferredSize(new Dimension(400, 0));
    }

    private void setupInfo() {
        this.info = new JLabel("-");
        add(this.info);
    }

}