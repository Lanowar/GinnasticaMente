package com.ginnasticamente.panels;

import java.awt.GridLayout;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.ginnasticamente.components.ElementsList;

public class MainTabPanel extends JPanel {
	
	public MainTabPanel() {
		
		super(new GridLayout());
		
		JTabbedPane tPane = new JTabbedPane();
		
		//Tabs
		JComponent mainPanel = makePanel(1, 2, new ElementsList());
		tPane.addTab("Principale", mainPanel);
		
		JComponent gymnastsPanel = makePanel(1, 3);
		tPane.addTab("Allievi", gymnastsPanel);
		
		JComponent exercisePanel = makePanel(1, 3);
		tPane.addTab("Esercizi", exercisePanel);
		
		add(tPane);
	}
	
	protected JComponent makePanel(int rows, int cols, JComponent... components) {
		
		JPanel panel = new JPanel(false);
		
		for (JComponent comp : components)
			panel.add(comp);
			
		panel.setLayout(new GridLayout(rows, cols));
		return panel;
	}
}
