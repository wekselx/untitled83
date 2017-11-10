package emulator.wekse.ua.Panel;

import emulator.wekse.ua.Logistic.XFormatter;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class XEventsInfoPanel extends JScrollPane {
    private JList<String> events = new JList<String>(new DefaultListModel<String>());
   public XEventsInfoPanel(){
       setupView();
       		setupEvents();
       		setVisible(true);
       	}
	public void update(int days, String event) {
   	((DefaultListModel<String>)this.events.getModel()).addElement(formatEvent(days, event));}

        	public void update(String event) {
        		((DefaultListModel<String>)this.events.getModel()).addElement(event);
        		int lastIndex = events.getModel().getSize() - 1;
        		if (lastIndex >= 0) {
        			events.ensureIndexIsVisible(lastIndex);
        		}
        	}

        	public void reset() {
        		((DefaultListModel<String>)this.events.getModel()).clear();
        	}

        	private void setupView() {
        		setBorder(new TitledBorder("Events Info"));
        		setPreferredSize(new Dimension(300, 0));
        	}

        	private void setupEvents() {
        		this.events.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        		this.events.setLayoutOrientation(JList.VERTICAL);
        		this.events.setBackground(new Color(0xEEEEEE));
        		setViewportView(this.events);
        	}
	private String formatEvent(int days, String event) {
		return "[" + XFormatter.formatDateShort(days) + "] " + event;
	}


}
